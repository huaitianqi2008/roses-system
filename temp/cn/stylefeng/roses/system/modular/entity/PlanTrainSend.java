package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 培训计划抄送消息记录表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_plan_train_send")
public class PlanTrainSend implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 计划id
     */
    private Long planId;

    /**
     * 年度培训计划id
     */
    private Long trainPlanId;

    private String senderName;

    /**
     * 抄送人id
     */
    private Long sender;

    private String receiverName;

    /**
     * 接收人id
     */
    private Long receiver;

    /**
     * 抄送时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;


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

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public Long getSender() {
        return sender;
    }

    public void setSender(Long sender) {
        this.sender = sender;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public Long getReceiver() {
        return receiver;
    }

    public void setReceiver(Long receiver) {
        this.receiver = receiver;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "PlanTrainSend{" +
        "id=" + id +
        ", planId=" + planId +
        ", trainPlanId=" + trainPlanId +
        ", senderName=" + senderName +
        ", sender=" + sender +
        ", receiverName=" + receiverName +
        ", receiver=" + receiver +
        ", createTime=" + createTime +
        "}";
    }
}
