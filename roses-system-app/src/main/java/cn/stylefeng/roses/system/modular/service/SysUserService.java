/**
 * Copyright 2018-2020 stylefeng & Hyer (sn93@qq.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.stylefeng.roses.system.modular.service;

import cn.stylefeng.roses.biz.dict.api.model.DictInfo;
import cn.stylefeng.roses.core.page.PageFactory;
import cn.stylefeng.roses.core.util.RSACoderUtil;
import cn.stylefeng.roses.core.util.Sha256Util;
import cn.stylefeng.roses.core.util.ToolUtil;
import cn.stylefeng.roses.kernel.jwt.utils.JwtTokenUtil;
import cn.stylefeng.roses.kernel.logger.util.LogUtil;
import cn.stylefeng.roses.kernel.model.exception.ServiceException;
import cn.stylefeng.roses.system.api.context.LoginUser;
import cn.stylefeng.roses.system.api.entity.SysUser;
import cn.stylefeng.roses.system.api.exception.enums.AuthExceptionEnum;
import cn.stylefeng.roses.system.api.factory.UserFactory;
import cn.stylefeng.roses.system.api.model.SysUserInfo;
import cn.stylefeng.roses.system.api.state.UserStatus;
import cn.stylefeng.roses.system.core.constants.SystemConstants;
import cn.stylefeng.roses.system.modular.mapper.SysUserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static cn.stylefeng.roses.system.api.exception.enums.AuthExceptionEnum.USER_NOT_FOUND;
import static cn.stylefeng.roses.system.api.exception.enums.SysUserExceptionEnum.ACCOUNT_IS_EXIST;
import static cn.stylefeng.roses.system.api.exception.enums.SysUserExceptionEnum.NEEDED_ATTR_NULL;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author stylefeng
 * @since 2018-08-26
 */
@Service
public class SysUserService extends ServiceImpl<SysUserMapper, SysUser> {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 用户登录，登录成功返回token
     *
     * @author Hyer
     * @Date 2018/8/26 下午3:14
     */
    public String login(String username, String password) {

        //查询账号是否存在
        SysUser sysUser = null;
        List<SysUser> accounts = this.list(new QueryWrapper<SysUser>().eq("ACCOUNT", username));
        if (accounts != null && accounts.size() > 0) {
            sysUser = accounts.get(0);
        } else {
            throw new ServiceException(USER_NOT_FOUND);
        }

/*        try {
            //密码解析
            password = RSACoderUtil.decryptByPrivateKey(password);
        } catch (Exception e) {
            throw new ServiceException(AuthExceptionEnum.INVALID_PWD);
        }*/

        String sha256Hex = Sha256Util.getSHA256(password + sysUser.getSalt());
        //校验账号密码是否正确
        //String md5Hex = ToolUtil.md5Hex(password + sysUser.getSalt());
        if (!sha256Hex.equals(sysUser.getPassword())) {
            throw new ServiceException(AuthExceptionEnum.INVALID_PWD);
        }

        //生成token
        String jwtToken = jwtTokenUtil.generateToken(sysUser.getUserId().toString(), null);

        //token放入缓存
        LoginUser loginUser = new LoginUser();
        loginUser.setAccountId(sysUser.getUserId());
        BoundValueOperations<String, Object> opts = redisTemplate.boundValueOps(SystemConstants.LOGIN_USER_CACHE_PREFIX + jwtToken);
        opts.set(loginUser, SystemConstants.DEFAULT_LOGIN_TIME_OUT_SECS, TimeUnit.SECONDS);
        LogUtil.info("用户登录成功");
        return jwtToken;
    }

    /**
     * 校验token是否正确
     *
     * @author Hyer
     * @Date 2018/8/26 下午4:06
     */
    public boolean checkToken(String token) {

        //先校验jwt是否正确
        if (!jwtTokenUtil.checkToken(token)) {
            return false;
        }

        //校验缓存是否有token
        BoundValueOperations<String, Object> opts = redisTemplate.boundValueOps(SystemConstants.LOGIN_USER_CACHE_PREFIX + token);
        LoginUser loginUser = (LoginUser) opts.get();
        if (loginUser == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 退出登录
     *
     * @author Hyer
     * @Date 2018/8/26 下午4:09
     */
    public void logout(String token) {
        redisTemplate.delete(SystemConstants.LOGIN_USER_CACHE_PREFIX + token);
    }

    /**
     * 获取登录用户通过token
     *
     * @author Hyer
     * @Date 2018/8/26 下午4:12
     */
    public LoginUser getLoginUserByToken(String token) {
        BoundValueOperations<String, Object> opts = redisTemplate.boundValueOps(SystemConstants.LOGIN_USER_CACHE_PREFIX + token);
        Object loginUser = opts.get();
        if (loginUser != null) {
            return (LoginUser) loginUser;
        } else {
            return null;
        }
    }

    /**
     * 新增系统管理员
     * @param sysUser
     */
    public Boolean addSysUser(SysUser sysUser) {
        if(ToolUtil.isOneEmpty(sysUser,sysUser.getAccount(),
                sysUser.getPassword(),
                sysUser.getPhone(),
                sysUser.getTelphone(),
                sysUser.getRealName(),
                sysUser.getLeaderName(),
                sysUser.getOrgId(),
                sysUser.getOrgName())){
            throw new ServiceException(NEEDED_ATTR_NULL);
        }

        /*        try {
            //密码解析（前端使用非对称加密时使用）
            password = RSACoderUtil.decryptByPrivateKey(password);
        } catch (Exception e) {
            throw new ServiceException(AuthExceptionEnum.INVALID_PWD);
        }*/
        //判断用户是否已存在
        SysUser existUser = this.getOne(new QueryWrapper<SysUser>().eq("account",sysUser.getAccount()));
        if(existUser!=null){
            throw new ServiceException(ACCOUNT_IS_EXIST);
        }

        //添加随机盐（5个随机字符）
        String salt = ToolUtil.getRandomString(5);
        sysUser.setSalt(salt);

        //根据盐和用户设置密码生成sha256加密密码
        sysUser.setPassword(Sha256Util.getSHA256(sysUser.getPassword()+ salt));

       return this.save(sysUser);
    }

    /**
     * 更新系统管理员
     * @param sysUser
     */
    public Boolean updateSysUser(SysUser sysUser) {
        if(ToolUtil.isOneEmpty(sysUser,sysUser.getUserId())){
            throw new ServiceException(NEEDED_ATTR_NULL);
        }

        SysUser oldSysUser = this.getById(sysUser.getUserId());
        if(oldSysUser ==null){
            throw new ServiceException(USER_NOT_FOUND);
        }

        oldSysUser = UserFactory.editUser(sysUser,oldSysUser);

        return this.updateById(oldSysUser);
    }

    /**
     * 获取系统管理员列表
     * @param page
     * @param sysUserInfo
     * @return
     */
    public List<SysUserInfo> getSysUserList(Page<SysUserInfo> page, SysUserInfo sysUserInfo) {

        if (page == null) {
            page = PageFactory.defaultPage();
        }

        if (sysUserInfo == null) {
            sysUserInfo = new SysUserInfo();
        }

        return baseMapper.getSysUserList(page, sysUserInfo);
    }

    /**
     * 更新系统用户（学员）状态
     * @param userId
     * @param status
     */
    public Boolean updateUserStatus(Long userId, Integer status) {

        SysUser sysUser = this.getById(userId);
        if(sysUser ==null){
            throw new ServiceException(USER_NOT_FOUND);
        }
        sysUser.setStatus(status);
       return this.updateById(sysUser);
    }

    /**
     *删除系统用户（学员）
     * @param userId
     */
    public Boolean deleteUser(Long userId) {
        SysUser sysUser = this.getById(userId);
        if(sysUser ==null){
            throw new ServiceException(USER_NOT_FOUND);
        }
        sysUser.setStatus(UserStatus.DELETE.getCode());
        return this.updateById(sysUser);
    }
}
