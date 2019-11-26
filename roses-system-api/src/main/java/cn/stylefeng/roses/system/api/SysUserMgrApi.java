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
package cn.stylefeng.roses.system.api;

import cn.stylefeng.roses.core.reqres.request.RequestData;
import cn.stylefeng.roses.core.reqres.response.ResponseData;
import cn.stylefeng.roses.system.api.entity.SysUser;
import cn.stylefeng.roses.system.api.model.SysUserInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 系统用户管理远程调用接口
 *
 * @author Hyer
 * @date 2018-07-27-上午10:12
 */
@RequestMapping("/api/sysUser")
public interface SysUserMgrApi {

    /**
     * 新增系统管理员
     *
     * @author Hyer
     * @Date 2019/11/25 下午3:17
     */
    @PostMapping(value = "/addSysUser")
    Boolean addSysUser(@RequestBody SysUser sysUser);

    /**
     * 修改系统管理员
     *
     * @author Hyer
     * @Date 2019/11/25 下午3:35
     */
    @PostMapping(value = "/updateSysUser")
    Boolean updateSysUser(@RequestBody SysUser sysUser);

    /**
     * 删除系统管理员
     *
     * @author Hyer
     * @Date 2019/11/25 下午4:53
     */
    @PostMapping(value = "/deleteSysUser")
    Boolean deleteSysUser(@RequestParam("userId") Long userId);

    /**
     * 更新系统用户状态
     *
     * @author Hyer
     * @Date 2019/11/25 下午4:53
     */
    @PostMapping(value = "/updateSysUserStatus")
    Boolean updateSysUserStatus(@RequestParam("userId") Long userId, @RequestParam("status") Integer status);

    /**
     * 获取系统用户列表
     *
     * @author Hyer
     * @Date 2019/11/25 下午5:18
     */
    @PostMapping(value = "/getSysUserList")
    List<SysUserInfo> getSysUserList(@RequestBody SysUserInfo sysUserInfo, @RequestParam("pageNo") Integer pageNo,
                                     @RequestParam("pageSize") Integer pageSize);



}
