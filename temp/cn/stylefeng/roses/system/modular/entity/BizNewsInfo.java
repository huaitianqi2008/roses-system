package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 通知公告表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_biz_news_info")
public class BizNewsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 新闻分类(1:通知公告)
     */
    private Integer newsType;

    /**
     * 新闻标题
     */
    private String newsTitle;

    /**
     * 新闻内容
     */
    private String newsContent;

    /**
     * 创建人名
     */
    private String createrName;

    /**
     * 浏览数量
     */
    private Integer lookNum;

    /**
     * 是否发布(0：未发布，1：已发布）
     */
    private Integer isPublish;

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
     * 审核状态（0：不通过，1:通过，2：待审核）
     */
    private Integer checkStatus;

    /**
     * 审核人
     */
    private Long checker;

    /**
     * 审核内容
     */
    private String checkContent;

    /**
     * 审核时间
     */
    private LocalDateTime checkTime;

    /**
     * 是否删除(0:否,1:是)
     */
    private Integer isDel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNewsType() {
        return newsType;
    }

    public void setNewsType(Integer newsType) {
        this.newsType = newsType;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName;
    }

    public Integer getLookNum() {
        return lookNum;
    }

    public void setLookNum(Integer lookNum) {
        this.lookNum = lookNum;
    }

    public Integer getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Integer isPublish) {
        this.isPublish = isPublish;
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

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Long getChecker() {
        return checker;
    }

    public void setChecker(Long checker) {
        this.checker = checker;
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "BizNewsInfo{" +
        "id=" + id +
        ", newsType=" + newsType +
        ", newsTitle=" + newsTitle +
        ", newsContent=" + newsContent +
        ", createrName=" + createrName +
        ", lookNum=" + lookNum +
        ", isPublish=" + isPublish +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", checkStatus=" + checkStatus +
        ", checker=" + checker +
        ", checkContent=" + checkContent +
        ", checkTime=" + checkTime +
        ", isDel=" + isDel +
        "}";
    }
}
