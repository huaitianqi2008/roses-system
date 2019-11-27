package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 培训班和学员关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_ref_stu")
public class TrainRefStu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 培训班id
     */
    private Long classId;

    /**
     * 学员id
     */
    private Long studentId;

    /**
     * 报名方式(0:个人,1:单位)
     */
    private Integer enterType;

    /**
     * 创建人id
     */
    private Long creater;

    /**
     * 报名时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 培训开始时间
     */
    private LocalDate startTime;

    /**
     * 培训结束时间
     */
    private LocalDate endTime;

    /**
     * 学员培训状态(1：优秀；2：结业；3：未结业)
     */
    private Integer trainStatus;

    /**
     * 培训班进度
     */
    private Integer trainPresent;

    /**
     * 学习结果(0:不达标1:达标)
     */
    private String studyResult;

    /**
     * 是否获得学分(0:否,1:是)
     */
    private Integer isGetScore;

    /**
     * 获得学分时间
     */
    private LocalDateTime getScoreTime;

    /**
     * 是否删除 0:否,1:是
     */
    private Integer isDel;

    /**
     * 报名审核状态(0:审核不通过,1:审核通过,2:待审核)
     */
    private Integer status;

    /**
     * 是否食（0：否，1：是）
     */
    private Integer isEat;

    /**
     * 审核1人id
     */
    private String checkUserId;

    /**
     * 审核1时间
     */
    private LocalDateTime checkTime;

    /**
     * 审核1记录
     */
    private String checkContent;

    /**
     * 是否宿（0：否，1：是）
     */
    private Integer isSleep;

    /**
     * 备注
     */
    private String remark;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Integer getEnterType() {
        return enterType;
    }

    public void setEnterType(Integer enterType) {
        this.enterType = enterType;
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

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public Integer getTrainStatus() {
        return trainStatus;
    }

    public void setTrainStatus(Integer trainStatus) {
        this.trainStatus = trainStatus;
    }

    public Integer getTrainPresent() {
        return trainPresent;
    }

    public void setTrainPresent(Integer trainPresent) {
        this.trainPresent = trainPresent;
    }

    public String getStudyResult() {
        return studyResult;
    }

    public void setStudyResult(String studyResult) {
        this.studyResult = studyResult;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsEat() {
        return isEat;
    }

    public void setIsEat(Integer isEat) {
        this.isEat = isEat;
    }

    public String getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(String checkUserId) {
        this.checkUserId = checkUserId;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    public Integer getIsSleep() {
        return isSleep;
    }

    public void setIsSleep(Integer isSleep) {
        this.isSleep = isSleep;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TrainRefStu{" +
        "id=" + id +
        ", classId=" + classId +
        ", studentId=" + studentId +
        ", enterType=" + enterType +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", trainStatus=" + trainStatus +
        ", trainPresent=" + trainPresent +
        ", studyResult=" + studyResult +
        ", isGetScore=" + isGetScore +
        ", getScoreTime=" + getScoreTime +
        ", isDel=" + isDel +
        ", status=" + status +
        ", isEat=" + isEat +
        ", checkUserId=" + checkUserId +
        ", checkTime=" + checkTime +
        ", checkContent=" + checkContent +
        ", isSleep=" + isSleep +
        ", remark=" + remark +
        "}";
    }
}
