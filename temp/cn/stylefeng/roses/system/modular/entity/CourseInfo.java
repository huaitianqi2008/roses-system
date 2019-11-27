package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 课程信息表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_course_info")
public class CourseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 课程分类id(后台课程分类管理生成)
     */
    private Long couseType;

    /**
     * 课程学分（课程学习最高可获学分）
     */
    private BigDecimal courseScore;

    /**
     * 主讲人教师名称
     */
    private String teacherName;

    /**
     * 主讲人职务
     */
    private String teacherJob;

    /**
     * 主讲人所在单位
     */
    private String teacherOrg;

    /**
     * 课程描述
     */
    private String courseDesc;

    /**
     * 课程标签
     */
    private Long labelId;

    /**
     * 课程标签名称
     */
    private String labelName;

    /**
     * 课程图片
     */
    private String courseImages;

    /**
     * 课程视频
     */
    private String videoUrl;

    /**
     * 视频时长(单位：秒)
     */
    private Integer videoHour;

    /**
     * 视频所在课件包中的地址
     */
    private String videoHref;

    /**
     * 被访问次数
     */
    private Integer visitedTimes;

    /**
     * 课程来源
     */
    private Integer courseSource;

    /**
     * 获取学分方式（0：学习进度达到要求获取，1：考试通过获得学分）
     */
    private Integer getScoreWay;

    /**
     * 学习进度达到设定值获得学分(如：80%）
     */
    private Integer learnPercent;

    /**
     * 发布状态（0：未发布，1：已发布）
     */
    private Integer isPublish;

    /**
     * 发布时间
     */
    private LocalDateTime publishTime;

    /**
     * 是否删除（0:否,1:是）
     */
    private Integer isDel;

    /**
     * 创建人id
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getCouseType() {
        return couseType;
    }

    public void setCouseType(Long couseType) {
        this.couseType = couseType;
    }

    public BigDecimal getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(BigDecimal courseScore) {
        this.courseScore = courseScore;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherJob() {
        return teacherJob;
    }

    public void setTeacherJob(String teacherJob) {
        this.teacherJob = teacherJob;
    }

    public String getTeacherOrg() {
        return teacherOrg;
    }

    public void setTeacherOrg(String teacherOrg) {
        this.teacherOrg = teacherOrg;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getCourseImages() {
        return courseImages;
    }

    public void setCourseImages(String courseImages) {
        this.courseImages = courseImages;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getVideoHour() {
        return videoHour;
    }

    public void setVideoHour(Integer videoHour) {
        this.videoHour = videoHour;
    }

    public String getVideoHref() {
        return videoHref;
    }

    public void setVideoHref(String videoHref) {
        this.videoHref = videoHref;
    }

    public Integer getVisitedTimes() {
        return visitedTimes;
    }

    public void setVisitedTimes(Integer visitedTimes) {
        this.visitedTimes = visitedTimes;
    }

    public Integer getCourseSource() {
        return courseSource;
    }

    public void setCourseSource(Integer courseSource) {
        this.courseSource = courseSource;
    }

    public Integer getGetScoreWay() {
        return getScoreWay;
    }

    public void setGetScoreWay(Integer getScoreWay) {
        this.getScoreWay = getScoreWay;
    }

    public Integer getLearnPercent() {
        return learnPercent;
    }

    public void setLearnPercent(Integer learnPercent) {
        this.learnPercent = learnPercent;
    }

    public Integer getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Integer isPublish) {
        this.isPublish = isPublish;
    }

    public LocalDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "CourseInfo{" +
        "id=" + id +
        ", courseName=" + courseName +
        ", couseType=" + couseType +
        ", courseScore=" + courseScore +
        ", teacherName=" + teacherName +
        ", teacherJob=" + teacherJob +
        ", teacherOrg=" + teacherOrg +
        ", courseDesc=" + courseDesc +
        ", labelId=" + labelId +
        ", labelName=" + labelName +
        ", courseImages=" + courseImages +
        ", videoUrl=" + videoUrl +
        ", videoHour=" + videoHour +
        ", videoHref=" + videoHref +
        ", visitedTimes=" + visitedTimes +
        ", courseSource=" + courseSource +
        ", getScoreWay=" + getScoreWay +
        ", learnPercent=" + learnPercent +
        ", isPublish=" + isPublish +
        ", publishTime=" + publishTime +
        ", isDel=" + isDel +
        ", creater=" + creater +
        ", createTime=" + createTime +
        "}";
    }
}
