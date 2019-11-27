package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 短信发送对象（创建短信对象分类，一个分类可关联多个要发送的用户，当发送短信时可选择某一分类快捷的选择某分类发送短信到该分类下绑定的成员）
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_sms_object")
public class SmsObject implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 对象名称
     */
    private String title;

    /**
     * 创建人
     */
    private Long creater;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return "SmsObject{" +
        "id=" + id +
        ", title=" + title +
        ", creater=" + creater +
        ", createTime=" + createTime +
        "}";
    }
}
