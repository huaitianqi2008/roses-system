package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 站内信
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_biz_mail_info")
public class BizMailInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 信件标题
     */
    private String mailTitle;

    /**
     * 信件内容
     */
    private String mailContent;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 是否删除(0:否,1:是)
     */
    private Integer isDel;

    /**
     * 创建人id
     */
    private Long creater;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMailTitle() {
        return mailTitle;
    }

    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle;
    }

    public String getMailContent() {
        return mailContent;
    }

    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
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
        return "BizMailInfo{" +
        "id=" + id +
        ", mailTitle=" + mailTitle +
        ", mailContent=" + mailContent +
        ", createTime=" + createTime +
        ", isDel=" + isDel +
        ", creater=" + creater +
        "}";
    }
}
