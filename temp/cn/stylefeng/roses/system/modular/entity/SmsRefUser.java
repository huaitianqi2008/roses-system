package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 短信发送记录表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_sms_ref_user")
public class SmsRefUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 短信发送类型
     */
    private Integer smsType;

    /**
     * 发送对象id(如:短信类型为普通短信的对象就是短信id,学分申报)
     */
    private Long objId;

    /**
     * 短信内容
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
     * 是否发送（0：发送失败，1：发送成功）
     */
    private Integer isSend;

    /**
     * 发送对象id(如:短信类型为普通短信的对象就是短信id,学分申报审核类型的对象就是对应的学分申报id)
     */
    private String errorReason;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSmsType() {
        return smsType;
    }

    public void setSmsType(Integer smsType) {
        this.smsType = smsType;
    }

    public Long getObjId() {
        return objId;
    }

    public void setObjId(Long objId) {
        this.objId = objId;
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

    public Integer getIsSend() {
        return isSend;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    @Override
    public String toString() {
        return "SmsRefUser{" +
        "id=" + id +
        ", smsType=" + smsType +
        ", objId=" + objId +
        ", content=" + content +
        ", sender=" + sender +
        ", receiver=" + receiver +
        ", isSend=" + isSend +
        ", errorReason=" + errorReason +
        "}";
    }
}
