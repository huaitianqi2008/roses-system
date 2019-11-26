package cn.stylefeng.roses.system.api.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

/**
 * <p>
 * 机构表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("sys_org")
public class SysOrg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "ID",type= IdType.ID_WORKER)
    private Long id;

    /**
     * 名称
     */
    @TableField("org_name")
    private String orgName;

    /**
     * 排序
     */
    @TableField("seq")
    private Long seq;

    /**
     * 父级编号
     */
    @TableField("parent_id")
    private Long parentId;

    /**
     * 所有父级编号
     */
    @TableField("parent_ids")
    private String parentIds;

    /**
     * 机构类型
     */
    @TableField("org_type")
    private String orgType;

    /**
     * 创建者
     */
    @TableField("creater")
    private String creater;

    /**
     * 创建时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    @TableField("updater")
    private String updater;

    /**
     * 更新时间
     */
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    /**
     * 备注信息
     */
    @TableField("remark")
    private String remark;

    /**
     * 是否删除（0：否，1：是）
     */
    @TableField("is_del")
    private Integer isDel;

    /**
     * 是否真实存在
     */
    @TableField("is_real_exist")
    private Integer isRealExist;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public Long getParentId() {
        return parentId;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsRealExist() {
        return isRealExist;
    }

    public void setIsRealExist(Integer isRealExist) {
        this.isRealExist = isRealExist;
    }

    @Override
    public String toString() {
        return "SysOrg{" +
                "id=" + id +
                ", orgName='" + orgName + '\'' +
                ", seq=" + seq +
                ", parentId=" + parentId +
                ", parentIds='" + parentIds + '\'' +
                ", orgType='" + orgType + '\'' +
                ", creater='" + creater + '\'' +
                ", createTime=" + createTime +
                ", updater='" + updater + '\'' +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                ", isDel=" + isDel +
                ", isRealExist=" + isRealExist +
                '}';
    }
}
