package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 人员调动记录表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_biz_transfer_user")
public class BizTransferUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 调动学员id
     */
    private Long stuId;

    /**
     * 学员姓名
     */
    private String stuName;

    /**
     * 学员所在部门id
     */
    private Long orgId;

    /**
     * 之前部门
     */
    private String orgName;

    /**
     * 调动后学员所在部门id
     */
    private Long applyOrgId;

    /**
     * 现在部门
     */
    private String applyOrgName;

    /**
     * 申请时间
     */
    private LocalDateTime applyTime;

    /**
     * 审核状态（0：审核不通过，1：审核通过，2：待审核）
     */
    private Integer checkStatus;

    /**
     * 审核人id
     */
    private Long checker;

    /**
     * 审核时间
     */
    private LocalDateTime checkTime;

    /**
     * 审核意见
     */
    private String checkContent;

    /**
     * 是否删除（0:否，1：是）
     */
    private Integer isDel;

    /**
     * 创建人id
     */
    private Long creater;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Long getApplyOrgId() {
        return applyOrgId;
    }

    public void setApplyOrgId(Long applyOrgId) {
        this.applyOrgId = applyOrgId;
    }

    public String getApplyOrgName() {
        return applyOrgName;
    }

    public void setApplyOrgName(String applyOrgName) {
        this.applyOrgName = applyOrgName;
    }

    public LocalDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(LocalDateTime applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Long getChecker() {
        return checker;
    }

    public void setChecker(Long checker) {
        this.checker = checker;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    @Override
    public String toString() {
        return "BizTransferUser{" +
        "id=" + id +
        ", stuId=" + stuId +
        ", stuName=" + stuName +
        ", orgId=" + orgId +
        ", orgName=" + orgName +
        ", applyOrgId=" + applyOrgId +
        ", applyOrgName=" + applyOrgName +
        ", applyTime=" + applyTime +
        ", checkStatus=" + checkStatus +
        ", checker=" + checker +
        ", checkTime=" + checkTime +
        ", checkContent=" + checkContent +
        ", isDel=" + isDel +
        ", creater=" + creater +
        "}";
    }
}
