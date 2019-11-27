package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 培训计划信息表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_plan_info")
public class PlanInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 是否为年度计划（0：临时，1：年度）
     */
    private Integer isYearplan;

    /**
     * 计划审核类型（0:报备，1：审核）
     */
    private Integer checkType;

    /**
     * 计划年份
     */
    private String planYear;

    /**
     * 计划名称
     */
    private String planName;

    /**
     * 计划填报单位id
     */
    private Long orgId;

    /**
     * 创建人id
     */
    private Long creater;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 是否删除(0:否,1:是)
     */
    private Integer isDel;

    /**
     * 是否发布（0:未发布，1：已发布）
     */
    private Integer isPublish;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIsYearplan() {
        return isYearplan;
    }

    public void setIsYearplan(Integer isYearplan) {
        this.isYearplan = isYearplan;
    }

    public Integer getCheckType() {
        return checkType;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    public String getPlanYear() {
        return planYear;
    }

    public void setPlanYear(String planYear) {
        this.planYear = planYear;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Integer isPublish) {
        this.isPublish = isPublish;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "PlanInfo{" +
        "id=" + id +
        ", isYearplan=" + isYearplan +
        ", checkType=" + checkType +
        ", planYear=" + planYear +
        ", planName=" + planName +
        ", orgId=" + orgId +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", isDel=" + isDel +
        ", isPublish=" + isPublish +
        ", updateTime=" + updateTime +
        "}";
    }
}
