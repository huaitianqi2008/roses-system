package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 培训班-抄送人意见信息
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_ref_sendmsg")
public class TrainRefSendmsg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 培训班级id
     */
    private Long classId;

    /**
     * 内容
     */
    private String content;

    /**
     * 发送人id
     */
    private Long sender;

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

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getSender() {
        return sender;
    }

    public void setSender(Long sender) {
        this.sender = sender;
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
        return "TrainRefSendmsg{" +
        "id=" + id +
        ", classId=" + classId +
        ", content=" + content +
        ", sender=" + sender +
        ", receiver=" + receiver +
        ", createTime=" + createTime +
        "}";
    }
}
