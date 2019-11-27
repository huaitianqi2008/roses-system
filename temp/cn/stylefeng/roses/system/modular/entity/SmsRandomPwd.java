package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 短信验证-随机密码表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_sms_random_pwd")
public class SmsRandomPwd implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 随机验证码
     */
    private String password;

    /**
     * 创建时间(根据此时间判断验证码可生效时长)
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SmsRandomPwd{" +
        "id=" + id +
        ", phone=" + phone +
        ", password=" + password +
        ", createTime=" + createTime +
        "}";
    }
}
