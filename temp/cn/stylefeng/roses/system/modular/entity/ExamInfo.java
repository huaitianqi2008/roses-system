package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 考试信息表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_exam_info")
public class ExamInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 创建人id
     */
    private Long creater;

    /**
     * 试卷名称
     */
    private String examName;

    /**
     * 考试开始时间
     */
    private LocalDateTime beginTime;

    /**
     * 考试结束时间
     */
    private LocalDateTime endTime;

    /**
     * 考试时长，分钟
     */
    private Integer examTime;

    /**
     * 考试类型（0：课程考试，1：班级考试，2：其他考试）
     */
    private Integer examType;

    /**
     * 对应课程ID
     */
    private Long courseId;

    /**
     * 培训班ID
     */
    private Long classId;

    /**
     * 是否公布成绩（0：否，1：是）
     */
    private Integer isPublishResult;

    /**
     * 发布状态（0：未发布，1：已发布）
     */
    private Integer isPublish;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 及格分数
     */
    private BigDecimal passScore;

    /**
     * 是否删除（0：未删，1：已删）
     */
    private Integer isDel;

    /**
     * 考试不通过是否允许重考（0:否；1是）
     */
    private Integer isReexam;

    /**
     * 试卷总分
     */
    private BigDecimal totalScore;

    /**
     * 考试通过可获学分
     */
    private BigDecimal examScore;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getExamTime() {
        return examTime;
    }

    public void setExamTime(Integer examTime) {
        this.examTime = examTime;
    }

    public Integer getExamType() {
        return examType;
    }

    public void setExamType(Integer examType) {
        this.examType = examType;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Integer getIsPublishResult() {
        return isPublishResult;
    }

    public void setIsPublishResult(Integer isPublishResult) {
        this.isPublishResult = isPublishResult;
    }

    public Integer getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Integer isPublish) {
        this.isPublish = isPublish;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getPassScore() {
        return passScore;
    }

    public void setPassScore(BigDecimal passScore) {
        this.passScore = passScore;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsReexam() {
        return isReexam;
    }

    public void setIsReexam(Integer isReexam) {
        this.isReexam = isReexam;
    }

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    public BigDecimal getExamScore() {
        return examScore;
    }

    public void setExamScore(BigDecimal examScore) {
        this.examScore = examScore;
    }

    @Override
    public String toString() {
        return "ExamInfo{" +
        "id=" + id +
        ", creater=" + creater +
        ", examName=" + examName +
        ", beginTime=" + beginTime +
        ", endTime=" + endTime +
        ", examTime=" + examTime +
        ", examType=" + examType +
        ", courseId=" + courseId +
        ", classId=" + classId +
        ", isPublishResult=" + isPublishResult +
        ", isPublish=" + isPublish +
        ", createTime=" + createTime +
        ", passScore=" + passScore +
        ", isDel=" + isDel +
        ", isReexam=" + isReexam +
        ", totalScore=" + totalScore +
        ", examScore=" + examScore +
        "}";
    }
}
