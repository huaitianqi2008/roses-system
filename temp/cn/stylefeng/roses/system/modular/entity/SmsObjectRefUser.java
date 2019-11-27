package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 短信类别与用户关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_sms_object_ref_user")
public class SmsObjectRefUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 短信对象ID
     */
    private Long smsObjectId;

    /**
     * 用户ID
     */
    private Long userId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSmsObjectId() {
        return smsObjectId;
    }

    public void setSmsObjectId(Long smsObjectId) {
        this.smsObjectId = smsObjectId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "SmsObjectRefUser{" +
        "id=" + id +
        ", smsObjectId=" + smsObjectId +
        ", userId=" + userId +
        "}";
    }
}
