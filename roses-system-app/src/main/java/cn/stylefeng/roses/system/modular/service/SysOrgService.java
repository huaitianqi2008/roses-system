package cn.stylefeng.roses.system.modular.service;

import cn.stylefeng.roses.core.page.PageFactory;
import cn.stylefeng.roses.core.util.ToolUtil;
import cn.stylefeng.roses.kernel.model.exception.ServiceException;
import cn.stylefeng.roses.system.api.entity.SysOrg;
import cn.stylefeng.roses.system.api.model.SysOrgInfo;
import cn.stylefeng.roses.system.api.model.SysUserInfo;
import cn.stylefeng.roses.system.api.state.OrgStatus;
import cn.stylefeng.roses.system.modular.mapper.SysOrgMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

import static cn.stylefeng.roses.system.api.exception.enums.SysOrgExceptionEnum.*;

/**
 * <p>
 * 机构表 服务类
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@Service
public class SysOrgService extends ServiceImpl<SysOrgMapper,SysOrg> {

    public Boolean addOrg(SysOrg sysOrg) {

        if(ToolUtil.isOneEmpty(sysOrg,
                sysOrg.getOrgName(),
                sysOrg.getIsRealExist(),
                sysOrg.getOrgType())){
            throw new ServiceException(NEEDED_ATTR_NULL);
        }

        SysOrg isExistOrg = this.getOne(new QueryWrapper<SysOrg>().eq("org_name",sysOrg.getOrgName()));
        if(isExistOrg !=null){
            throw new ServiceException(ORG_IS_EXIST);
        }

        this.orgSetPids(sysOrg);

        return this.save(sysOrg);
    }

    public Boolean updateOrg(SysOrg sysOrg) {
        SysOrg isExistOrg = this.getOne(new QueryWrapper<SysOrg>().eq("org_name",sysOrg.getOrgName()));
        if(isExistOrg !=null){
            throw new ServiceException(ORG_IS_EXIST);
        }
        SysOrg oldOrg = this.getById(sysOrg.getId());
        if(oldOrg ==null){
            throw new ServiceException(ORG_IS_NOT_EXIST);
        }
        this.orgSetPids(sysOrg);
        ToolUtil.copyProperties(sysOrg, oldOrg);

        return this.updateById(oldOrg);
    }

    /**
     * 删除组织机构
     * @param orgId
     * @return
     */
    public Boolean deleteOrg(Long orgId) {
        SysOrg sysOrg = this.getById(orgId);
        if(sysOrg ==null){
            return true;
        }
        //查看机构下面是否还有人员，有人不能删除
        int userNum = this.baseMapper.selectUserNumByOrgId(orgId);
        if(userNum>0){
            throw new ServiceException(EXIST_USER);
        }
        sysOrg.setIsDel(OrgStatus.DELETE.getCode());
        return this.updateById(sysOrg);
    }
    public List<SysOrgInfo> getOrgList(Page page, SysOrgInfo sysOrgInfo) {
        if (page == null) {
            page = PageFactory.defaultPage();
        }

        if (sysOrgInfo == null) {
            sysOrgInfo = new SysOrgInfo();
        }
        return baseMapper.getOrgList(page, sysOrgInfo);
    }

    /**
     * 根据组织机构的父部分查找parentId和parentIds
     * @param sysOrg
     */
    private void orgSetPids(SysOrg sysOrg) {
        if (ToolUtil.isEmpty(sysOrg.getParentId()) || sysOrg.getParentId().equals(0L)) {
            sysOrg.setParentId(0L);
            sysOrg.setParentIds("[0],");
        } else {
            long pid = sysOrg.getParentId();
            SysOrg temp = this.getById(pid);
            String pids = temp.getParentIds();
            sysOrg.setParentId(pid);
            sysOrg.setParentIds(pids + "[" + pid + "],");
        }
    }

}
