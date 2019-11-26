package cn.stylefeng.roses.system.modular.mapper;

import cn.stylefeng.roses.system.api.entity.SysOrg;
import cn.stylefeng.roses.system.api.model.SysOrgInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import feign.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 机构表 Mapper 接口
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@Mapper
public interface SysOrgMapper extends BaseMapper<SysOrg> {

    int selectUserNumByOrgId(@Param("orgId") Long orgId);

    List<SysOrgInfo> getOrgList(Page page, SysOrgInfo sysOrgInfo);
}
