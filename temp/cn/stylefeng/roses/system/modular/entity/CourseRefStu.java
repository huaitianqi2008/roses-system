package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 本系统课程-学员关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_course_ref_stu")
public class CourseRefStu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 课程id
     */
    private Long courseId;

    /**
     * 课程名称（冗余字段，增加查询速度）
     */
    private String courseName;

    /**
     * 学员id
     */
    private Long studentId;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 学习开始时间
     */
    private LocalDateTime startTime;

    /**
     * 学习结束时间
     */
    private LocalDateTime endTime;

    /**
     * 学习进度
     */
    private Float studyPresent;

    /**
     * 视频当前播放位置(以时间算)
     */
    private Integer studyLocation;

    /**
     * 是否获得学分(0:否,1:是)
     */
    private Integer isGetScore;

    /**
     * 获得学分时间
     */
    private LocalDateTime getScoreTime;

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

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Float getStudyPresent() {
        return studyPresent;
    }

    public void setStudyPresent(Float studyPresent) {
        this.studyPresent = studyPresent;
    }

    public Integer getStudyLocation() {
        return studyLocation;
    }

    public void setStudyLocation(Integer studyLocation) {
        this.studyLocation = studyLocation;
    }

    public Integer getIsGetScore() {
        return isGetScore;
    }

    public void setIsGetScore(Integer isGetScore) {
        this.isGetScore = isGetScore;
    }

    public LocalDateTime getGetScoreTime() {
        return getScoreTime;
    }

    public void setGetScoreTime(LocalDateTime getScoreTime) {
        this.getScoreTime = getScoreTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "CourseRefStu{" +
        "id=" + id +
        ", courseId=" + courseId +
        ", courseName=" + courseName +
        ", studentId=" + studentId +
        ", createTime=" + createTime +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", studyPresent=" + studyPresent +
        ", studyLocation=" + studyLocation +
        ", isGetScore=" + isGetScore +
        ", getScoreTime=" + getScoreTime +
        ", isDel=" + isDel +
        "}";
    }
}
