package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 友情链接
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_biz_friendlylink")
public class BizFriendlylink implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 链接类型
     */
    private Integer linkType;

    /**
     * 链接标题
     */
    private String linkTitle;

    /**
     * 链接URL
     */
    private String linkUrl;

    /**
     * 创建人id
     */
    private Long creater;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * 是否发布（ 0：未发布，1：已发布 ）
     */
    private Integer isPublish;

    /**
     * 是否删除（0：否，1：是）
     */
    private Integer isDel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLinkType() {
        return linkType;
    }

    public void setLinkType(Integer linkType) {
        this.linkType = linkType;
    }

    public String getLinkTitle() {
        return linkTitle;
    }

    public void setLinkTitle(String linkTitle) {
        this.linkTitle = linkTitle;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
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

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Integer isPublish) {
        this.isPublish = isPublish;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "BizFriendlylink{" +
        "id=" + id +
        ", linkType=" + linkType +
        ", linkTitle=" + linkTitle +
        ", linkUrl=" + linkUrl +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", seq=" + seq +
        ", isPublish=" + isPublish +
        ", isDel=" + isDel +
        "}";
    }
}
