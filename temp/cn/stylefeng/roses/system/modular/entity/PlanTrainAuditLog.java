package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 培训计划班级审核记录表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_plan_train_audit_log")
public class PlanTrainAuditLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 培训计划id
     */
    private Long planId;

    /**
     * 年度计划表id
     */
    private Long trainPlanId;

    /**
     * 审核人id
     */
    private Long checker;

    /**
     * 培训班审核状态(0:审核不通过,1:审核通过,2:待审核)
     */
    private Integer checkStatus;

    /**
     * 审核意见
     */
    private String checkContent;

    /**
     * 审核时间
     */
    private LocalDateTime checkTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Long getTrainPlanId() {
        return trainPlanId;
    }

    public void setTrainPlanId(Long trainPlanId) {
        this.trainPlanId = trainPlanId;
    }

    public Long getChecker() {
        return checker;
    }

    public void setChecker(Long checker) {
        this.checker = checker;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    @Override
    public String toString() {
        return "PlanTrainAuditLog{" +
        "id=" + id +
        ", planId=" + planId +
        ", trainPlanId=" + trainPlanId +
        ", checker=" + checker +
        ", checkStatus=" + checkStatus +
        ", checkContent=" + checkContent +
        ", checkTime=" + checkTime +
        "}";
    }
}
