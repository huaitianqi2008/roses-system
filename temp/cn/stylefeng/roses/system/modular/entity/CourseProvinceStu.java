package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 省网课程-学员关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_course_province_stu")
public class CourseProvinceStu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 学员id
     */
    private Long stuId;

    /**
     * 学员名称
     */
    private String stuName;

    /**
     * 省网课程id
     */
    private String courseId;

    /**
     * 取得的学分（这里这个值大于0表示已学，等于0表示在学）
     */
    private BigDecimal getScore;

    /**
     * 获得学分时间
     */
    private LocalDateTime getScoreTime;

    /**
     * 选课时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 学习进度
     */
    private BigDecimal learnPercent;

    /**
     * 最近学习时间
     */
    private LocalDateTime latestLearnTime;

    /**
     * 考试次数（三次不过需重新学习）
     */
    private Integer examTimes;

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

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public BigDecimal getGetScore() {
        return getScore;
    }

    public void setGetScore(BigDecimal getScore) {
        this.getScore = getScore;
    }

    public LocalDateTime getGetScoreTime() {
        return getScoreTime;
    }

    public void setGetScoreTime(LocalDateTime getScoreTime) {
        this.getScoreTime = getScoreTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getLearnPercent() {
        return learnPercent;
    }

    public void setLearnPercent(BigDecimal learnPercent) {
        this.learnPercent = learnPercent;
    }

    public LocalDateTime getLatestLearnTime() {
        return latestLearnTime;
    }

    public void setLatestLearnTime(LocalDateTime latestLearnTime) {
        this.latestLearnTime = latestLearnTime;
    }

    public Integer getExamTimes() {
        return examTimes;
    }

    public void setExamTimes(Integer examTimes) {
        this.examTimes = examTimes;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "CourseProvinceStu{" +
        "id=" + id +
        ", stuId=" + stuId +
        ", stuName=" + stuName +
        ", courseId=" + courseId +
        ", getScore=" + getScore +
        ", getScoreTime=" + getScoreTime +
        ", createTime=" + createTime +
        ", learnPercent=" + learnPercent +
        ", latestLearnTime=" + latestLearnTime +
        ", examTimes=" + examTimes +
        ", isDel=" + isDel +
        "}";
    }
}
