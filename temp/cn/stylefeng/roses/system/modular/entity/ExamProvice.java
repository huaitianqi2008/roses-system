package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 省网课程考试表（规则：因为考卷是存放在省网系统，此试卷将在考生学习完课程，进入考试的时候生成，和考生id关联，
考生在考试结束前不论省网试卷是否有改动，都会继续使用此试卷考试，若考生一次考试不过需重新考试，需重新获取考卷供学员考试使用）
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_exam_provice")
public class ExamProvice implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 省网课程id
     */
    private String courseId;

    /**
     * 考试名称
     */
    private String examName;

    /**
     * 及格分数
     */
    private Integer passScore;

    /**
     * 考试时长(分)
     */
    private Integer examTime;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 考试开始时间
     */
    private LocalDateTime beginTime;

    /**
     * 考试结束时间
     */
    private LocalDateTime endTime;

    /**
     * 试卷分数
     */
    private BigDecimal examScore;

    /**
     * 考生id
     */
    private Long studentId;


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

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Integer getPassScore() {
        return passScore;
    }

    public void setPassScore(Integer passScore) {
        this.passScore = passScore;
    }

    public Integer getExamTime() {
        return examTime;
    }

    public void setExamTime(Integer examTime) {
        this.examTime = examTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
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

    public BigDecimal getExamScore() {
        return examScore;
    }

    public void setExamScore(BigDecimal examScore) {
        this.examScore = examScore;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "ExamProvice{" +
        "id=" + id +
        ", courseId=" + courseId +
        ", examName=" + examName +
        ", passScore=" + passScore +
        ", examTime=" + examTime +
        ", createTime=" + createTime +
        ", beginTime=" + beginTime +
        ", endTime=" + endTime +
        ", examScore=" + examScore +
        ", studentId=" + studentId +
        "}";
    }
}
