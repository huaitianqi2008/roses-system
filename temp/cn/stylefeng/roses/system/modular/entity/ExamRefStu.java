package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 考试与学生关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_exam_ref_stu")
public class ExamRefStu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 考试ID
     */
    private Long examId;

    /**
     * 学员ID
     */
    private Long studentId;

    /**
     * 开始考试时间
     */
    private LocalDateTime startTime;

    /**
     * 考试结束时间
     */
    private LocalDateTime endTime;

    /**
     * 考试时长(秒)
     */
    private Integer examTime;

    /**
     * 剩余时长(秒)
     */
    private Integer remaindTime;

    /**
     * 状态（0:未开始、1:考试中、2:已结束、3：重考）
     */
    private Integer examStatus;

    /**
     * 重考次数
     */
    private Integer reExamNum;

    /**
     * 进入考试次数
     */
    private Integer reLoginNum;

    /**
     * 最后一次进入考试的时间（用于判断用户考试完成的时间）
     */
    private LocalDateTime lastLoginTime;

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
     * 考试得分
     */
    private BigDecimal getScore;

    /**
     * 是否已公布成绩(0：未公布，1：已公布）
     */
    private Integer isPublishResult;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
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

    public Integer getExamTime() {
        return examTime;
    }

    public void setExamTime(Integer examTime) {
        this.examTime = examTime;
    }

    public Integer getRemaindTime() {
        return remaindTime;
    }

    public void setRemaindTime(Integer remaindTime) {
        this.remaindTime = remaindTime;
    }

    public Integer getExamStatus() {
        return examStatus;
    }

    public void setExamStatus(Integer examStatus) {
        this.examStatus = examStatus;
    }

    public Integer getReExamNum() {
        return reExamNum;
    }

    public void setReExamNum(Integer reExamNum) {
        this.reExamNum = reExamNum;
    }

    public Integer getReLoginNum() {
        return reLoginNum;
    }

    public void setReLoginNum(Integer reLoginNum) {
        this.reLoginNum = reLoginNum;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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

    public BigDecimal getGetScore() {
        return getScore;
    }

    public void setGetScore(BigDecimal getScore) {
        this.getScore = getScore;
    }

    public Integer getIsPublishResult() {
        return isPublishResult;
    }

    public void setIsPublishResult(Integer isPublishResult) {
        this.isPublishResult = isPublishResult;
    }

    @Override
    public String toString() {
        return "ExamRefStu{" +
        "id=" + id +
        ", examId=" + examId +
        ", studentId=" + studentId +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", examTime=" + examTime +
        ", remaindTime=" + remaindTime +
        ", examStatus=" + examStatus +
        ", reExamNum=" + reExamNum +
        ", reLoginNum=" + reLoginNum +
        ", lastLoginTime=" + lastLoginTime +
        ", createTime=" + createTime +
        ", isDel=" + isDel +
        ", getScore=" + getScore +
        ", isPublishResult=" + isPublishResult +
        "}";
    }
}
