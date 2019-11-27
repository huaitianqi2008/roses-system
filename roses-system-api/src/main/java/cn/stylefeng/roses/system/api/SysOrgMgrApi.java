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

import cn.stylefeng.roses.system.api.entity.SysOrg;
import cn.stylefeng.roses.system.api.entity.SysUser;
import cn.stylefeng.roses.system.api.model.SysOrgInfo;
import cn.stylefeng.roses.system.api.model.SysUserInfo;
import cn.stylefeng.roses.system.api.model.TreeOrgInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 系统用户管理远程调用接口
 *
 * @author Hyer
 * @date 2018-07-27-上午10:12
 */
@RequestMapping("/api/sysOrg")
public interface SysOrgMgrApi {

    /**
     * 新增组织机构
     *
     * @author Hyer
     * @Date 2019/11/25 下午3:17
     */
    @PostMapping(value = "/addOrg")
    Boolean addOrg(@RequestBody SysOrg sysOrg);

    /**
     * 修改组织机构
     *
     * @author Hyer
     * @Date 2019/11/25 下午3:35
     */
    @PostMapping(value = "/updateOrg")
    Boolean updateOrg(@RequestBody SysOrg sysOrg);

    /**
     * 删除组织机构
     *
     * @author Hyer
     * @Date 2019/11/25 下午4:53
     */
    @PostMapping(value = "/deleteOrg")
    Boolean deleteOrg(@RequestParam("orgId") Long orgId);


    /**
     * 获取组织机构列表
     *
     * @author Hyer
     * @Date 2019/11/25 下午5:18
     */
    @PostMapping(value = "/getOrgList")
    List<SysOrgInfo> getOrgList(@RequestBody SysOrgInfo sysOrgInfo, @RequestParam("pageNo") Integer pageNo,
                                 @RequestParam("pageSize") Integer pageSize);


    /**
     * 获取树形组织机构列表
     *
     * @author Hyer
     * @Date 2018/7/25 下午5:53
     */
    @PostMapping(value = "/getTreeOrgList")
    public List<TreeOrgInfo> getTreeOrgList(@RequestParam("orgId") Long orgId);
}
