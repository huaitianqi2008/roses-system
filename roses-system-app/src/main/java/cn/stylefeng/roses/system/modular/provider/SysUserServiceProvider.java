package cn.stylefeng.roses.system.modular.provider;

import cn.stylefeng.roses.core.page.PageFactory;
import cn.stylefeng.roses.core.reqres.response.ResponseData;
import cn.stylefeng.roses.kernel.scanner.modular.stereotype.ApiResource;
import cn.stylefeng.roses.system.api.SysUserMgrApi;
import cn.stylefeng.roses.system.api.entity.SysUser;
import cn.stylefeng.roses.system.api.model.SysUserInfo;
import cn.stylefeng.roses.system.modular.service.SysUserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户管理
 *
 * @author Hyer
 * @Date 2019/11/25 下午12:47
 */
@RestController
/*@ApiResource(name = "系统用户管理", path = "/sysuser")*/
public class SysUserServiceProvider implements SysUserMgrApi {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 添加系统用户
     *
     * @author Hyer
     * @Date 2019/11/25 下午12:36
     */
    @PostMapping(name = "添加系统用户", path = "/addSysUser")
    public Boolean addSysUser(@RequestBody SysUser sysUser) {
        Boolean result = this.sysUserService.addSysUser(sysUser);
        return result;
    }

    /**
     * 修改系统用户
     *
     * @author Hyer
     * @Date 2019/11/25 下午12:36
     */
    @PostMapping(name = "修改系统用户", path = "/updateSysUser")
    public Boolean updateSysUser(@RequestBody SysUser sysUser) {
        return this.sysUserService.updateSysUser(sysUser);
    }

    /**
     * 删除系统用户（学员）
     *
     * @author Hyer
     * @Date 2019/11/25 下午12:36
     */
    @PostMapping(name = "删除系统用户（学员）", path = "/deleteSysUser")
    public Boolean deleteSysUser(@RequestParam("userId") Long userId) {
        return this.sysUserService.deleteUser(userId);
    }

    /**
     * 更新系统用户（学员）状态
     *
     * @author Hyer
     * @Date 2019/11/25 下午12:36
     */
    @PostMapping(name = "更新系统用户（学员）状态", path = "/updateSysUserStatus")
    public Boolean updateSysUserStatus(@RequestParam("userId") Long userId, @RequestParam("status") Integer status) {
        return this.sysUserService.updateUserStatus(userId, status);

    }

    /**
     * 获取系统管理员列表
     *
     * @author Hyer
     * @Date 2019/11/25 下午12:36
     */
    @PostMapping(name = "获取系统管理员列表", path = "/getSysUserList")
    public List<SysUserInfo> getSysUserList(@RequestBody SysUserInfo sysUserInfo, @RequestParam("pageNo") Integer pageNo,
                                       @RequestParam("pageSize") Integer pageSize) {
        return this.sysUserService.getSysUserList(new Page(pageNo, pageSize), sysUserInfo);

    }



}
