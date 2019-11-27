package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 短信表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_sms_info")
public class SmsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 短信内容
     */
    private String content;

    /**
     * 发送人
     */
    private Long sender;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SmsInfo{" +
        "id=" + id +
        ", content=" + content +
        ", sender=" + sender +
        ", createTime=" + createTime +
        "}";
    }
}
