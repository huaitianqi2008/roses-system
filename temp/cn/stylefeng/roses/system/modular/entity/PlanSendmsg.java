package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 培训计划抄送消息表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_plan_sendmsg")
public class PlanSendmsg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 培训计划id
     */
    private Long planId;

    /**
     * 内容
     */
    private String content;

    /**
     * 发送人id
     */
    private Long creater;

    /**
     * 接收人id
     */
    private Long receiver;

    /**
     * 发送时间
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
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
        return "PlanSendmsg{" +
        "id=" + id +
        ", planId=" + planId +
        ", content=" + content +
        ", creater=" + creater +
        ", receiver=" + receiver +
        ", createTime=" + createTime +
        "}";
    }
}
