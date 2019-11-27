package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 系统消息表（用于审核、系统消息等通知）
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_biz_system_news")
public class BizSystemNews implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 学员或管理员id
     */
    private Long userId;

    /**
     * 消息标题
     */
    private String noticeTitle;

    /**
     * 消息内容详情
     */
    private String noticeContent;

    /**
     * 是否已读（0：否，1：是）
     */
    private Integer isRead;

    /**
     * 是否删除（0：否 1：是）
     */
    private Integer isDel;

    /**
     * 消息产生时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "BizSystemNews{" +
        "id=" + id +
        ", userId=" + userId +
        ", noticeTitle=" + noticeTitle +
        ", noticeContent=" + noticeContent +
        ", isRead=" + isRead +
        ", isDel=" + isDel +
        ", createTime=" + createTime +
        "}";
    }
}
