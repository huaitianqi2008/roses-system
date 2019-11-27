package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 省网课程表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_course_province")
public class CourseProvince implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 省网课程id
     */
    private String courseId;

    /**
     * 省网课程类型ID，省网返回是36位uuid
     */
    private String courseTypeId;

    /**
     * 课程类型名
     */
    private String courseTypeName;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 课程学分
     */
    private BigDecimal courseScore;

    /**
     * 讲师名称
     */
    private String teacherName;

    /**
     * 讲师职称
     */
    private String teacherJob;

    /**
     * 课程介绍
     */
    private String courseDesc;

    /**
     * 学分类型
     */
    private String scoreType;

    /**
     * 课程时长(分钟)
     */
    private Integer courseHour;

    /**
     * 课程来源
     */
    private Integer courseSource;

    /**
     * 是否发布(0:否，1：是)
     */
    private Integer isPublish;

    /**
     * 课程发布时间
     */
    private LocalDateTime publishTime;

    /**
     * 是否删除（0:否,1:是）
     */
    private Integer isDel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getScoreType() {
        return scoreType;
    }

    public void setScoreType(String scoreType) {
        this.scoreType = scoreType;
    }

    public Integer getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(Integer courseHour) {
        this.courseHour = courseHour;
    }

    public Integer getCourseSource() {
        return courseSource;
    }

    public void setCourseSource(Integer courseSource) {
        this.courseSource = courseSource;
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

    @Override
    public String toString() {
        return "CourseProvince{" +
        "id=" + id +
        ", courseId=" + courseId +
        ", courseTypeId=" + courseTypeId +
        ", courseTypeName=" + courseTypeName +
        ", courseName=" + courseName +
        ", courseScore=" + courseScore +
        ", teacherName=" + teacherName +
        ", teacherJob=" + teacherJob +
        ", courseDesc=" + courseDesc +
        ", scoreType=" + scoreType +
        ", courseHour=" + courseHour +
        ", courseSource=" + courseSource +
        ", isPublish=" + isPublish +
        ", publishTime=" + publishTime +
        ", isDel=" + isDel +
        "}";
    }
}
