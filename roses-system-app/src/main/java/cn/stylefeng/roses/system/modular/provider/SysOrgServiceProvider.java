package cn.stylefeng.roses.system.modular.provider;

import cn.stylefeng.roses.system.api.SysOrgMgrApi;
import cn.stylefeng.roses.system.api.entity.SysOrg;
import cn.stylefeng.roses.system.api.entity.SysUser;
import cn.stylefeng.roses.system.api.model.SysOrgInfo;
import cn.stylefeng.roses.system.api.model.SysUserInfo;
import cn.stylefeng.roses.system.api.model.TreeOrgInfo;
import cn.stylefeng.roses.system.modular.service.SysOrgService;
import cn.stylefeng.roses.system.modular.service.SysUserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户管理
 *
 * @author Hyer
 * @Date 2019/11/25 下午12:47
 */
@RestController
/*@ApiResource(name = "系统用户管理", path = "/sysuser")*/
public class SysOrgServiceProvider implements SysOrgMgrApi {

    @Autowired
    private SysOrgService sysOrgService;

    /**
     * 添加组织机构
     *
     * @author Hyer
     * @Date 2019/11/25 下午12:36
     */
    @PostMapping(name = "添加组织机构", path = "/addOrg")
    public Boolean addOrg(@RequestBody SysOrg sysOrg) {
        Boolean result = this.sysOrgService.addOrg(sysOrg);
        return result;
    }

    /**
     * 修改组织机构
     *
     * @author Hyer
     * @Date 2019/11/25 下午12:36
     */
    @PostMapping(name = "修改组织机构", path = "/updateOrg")
    public Boolean updateOrg(@RequestBody SysOrg sysOrg) {

        return this.sysOrgService.updateOrg(sysOrg);
    }

    /**
     * 删除组织机构
     *
     * @author Hyer
     * @Date 2019/11/25 下午12:36
     */
    @PostMapping(name = "删除系统用户（学员）", path = "/deleteOrg")
    public Boolean deleteOrg(@RequestParam("orgId") Long orgId) {

        return this.sysOrgService.deleteOrg(orgId);
    }


    @Override
    public List<TreeOrgInfo> getTreeOrgList(Long orgId) {
        return null;
    }

    /**
     * 获取系统管理员列表
     *
     * @author Hyer
     * @Date 2019/11/25 下午12:36
     */
    @PostMapping(name = "获取系统管理员列表", path = "/getOrgList")
    public List<SysOrgInfo> getOrgList(@RequestBody SysOrgInfo sysOrgInfo, @RequestParam("pageNo") Integer pageNo,
                                            @RequestParam("pageSize") Integer pageSize) {
        return this.sysOrgService.getOrgList(new Page(pageNo, pageSize), sysOrgInfo);

    }



}
