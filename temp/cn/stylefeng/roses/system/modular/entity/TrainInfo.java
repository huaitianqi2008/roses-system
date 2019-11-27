package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 培训班表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_info")
public class TrainInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String trainName;

    /**
     * 计划id
     */
    private Long projectId;

    /**
     * 培训计划班级id
     */
    private Long projectTrainId;

    /**
     * 培训班期次
     */
    private String period;

    /**
     * 培训方式 : 0:脱产培训班,1:网上自主学习班,2:其他班
     */
    private Integer trainWay;

    /**
     * 培训类型(0:主体班,1:单位组织班,2:其他班)
     */
    private Integer trainType;

    /**
     * 报名起始时间
     */
    private LocalDateTime enrollStartTime;

    /**
     * 报名结束时间
     */
    private LocalDateTime enrollEndTime;

    /**
     * 培训起始时间
     */
    private LocalDateTime trainStartTime;

    /**
     * 培训结束时间
     */
    private LocalDateTime trainEndTime;

    /**
     * 培训学分
     */
    private BigDecimal trainScore;

    /**
     * 是否允许个人报名（0:个人报名，1：单位管理员统一报名，2：个人或单位管理员报名）
     */
    private Integer enrollWay;

    /**
     * 主办单位
     */
    private String organizer;

    /**
     * 培训天数
     */
    private BigDecimal trainDays;

    /**
     * 最大培训人数
     */
    private Integer maxTrainNum;

    /**
     * 培训机构
     */
    private String trainOrg;

    /**
     * 培训班介绍
     */
    private String introduce;

    /**
     * 培训班创建人所在机构
     */
    private Long orgId;

    /**
     * 创建人
     */
    private Long creater;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 培训对象
     */
    private String trainObject;

    /**
     * 班级状态：1：建班成功；2：报名中；3：报名截止；4：培训中；5：已结班；6：取消开班
     */
    private Integer trainStatus;

    /**
     * 培训地点（1：市内，2：省内，3：省外，4：国外）
     */
    private Integer trainAddress;

    /**
     * 详细地址
     */
    private String detailAddress;

    /**
     * 是否脱产（0：否，1：是）
     */
    private Integer isOffJob;

    /**
     * 是否使用微信小程序管理
     */
    private Integer isUseWx;

    /**
     * 是否发布(0：未发布，1：已发布）
     */
    private Integer isPublish;

    /**
     * 是否删除 (0:否,1:是）
     */
    private Integer isDel;

    /**
     * 审核人id
     */
    private Long checker;

    /**
     * 培训班审核状态(0:审核不通过,1:审核通过,2:待审核)
     */
    private Integer checkStatus;

    /**
     * 审核时间
     */
    private LocalDateTime checkTime;

    /**
     * 审核记录
     */
    private String checkContent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getProjectTrainId() {
        return projectTrainId;
    }

    public void setProjectTrainId(Long projectTrainId) {
        this.projectTrainId = projectTrainId;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Integer getTrainWay() {
        return trainWay;
    }

    public void setTrainWay(Integer trainWay) {
        this.trainWay = trainWay;
    }

    public Integer getTrainType() {
        return trainType;
    }

    public void setTrainType(Integer trainType) {
        this.trainType = trainType;
    }

    public LocalDateTime getEnrollStartTime() {
        return enrollStartTime;
    }

    public void setEnrollStartTime(LocalDateTime enrollStartTime) {
        this.enrollStartTime = enrollStartTime;
    }

    public LocalDateTime getEnrollEndTime() {
        return enrollEndTime;
    }

    public void setEnrollEndTime(LocalDateTime enrollEndTime) {
        this.enrollEndTime = enrollEndTime;
    }

    public LocalDateTime getTrainStartTime() {
        return trainStartTime;
    }

    public void setTrainStartTime(LocalDateTime trainStartTime) {
        this.trainStartTime = trainStartTime;
    }

    public LocalDateTime getTrainEndTime() {
        return trainEndTime;
    }

    public void setTrainEndTime(LocalDateTime trainEndTime) {
        this.trainEndTime = trainEndTime;
    }

    public BigDecimal getTrainScore() {
        return trainScore;
    }

    public void setTrainScore(BigDecimal trainScore) {
        this.trainScore = trainScore;
    }

    public Integer getEnrollWay() {
        return enrollWay;
    }

    public void setEnrollWay(Integer enrollWay) {
        this.enrollWay = enrollWay;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public BigDecimal getTrainDays() {
        return trainDays;
    }

    public void setTrainDays(BigDecimal trainDays) {
        this.trainDays = trainDays;
    }

    public Integer getMaxTrainNum() {
        return maxTrainNum;
    }

    public void setMaxTrainNum(Integer maxTrainNum) {
        this.maxTrainNum = maxTrainNum;
    }

    public String getTrainOrg() {
        return trainOrg;
    }

    public void setTrainOrg(String trainOrg) {
        this.trainOrg = trainOrg;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
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

    public String getTrainObject() {
        return trainObject;
    }

    public void setTrainObject(String trainObject) {
        this.trainObject = trainObject;
    }

    public Integer getTrainStatus() {
        return trainStatus;
    }

    public void setTrainStatus(Integer trainStatus) {
        this.trainStatus = trainStatus;
    }

    public Integer getTrainAddress() {
        return trainAddress;
    }

    public void setTrainAddress(Integer trainAddress) {
        this.trainAddress = trainAddress;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public Integer getIsOffJob() {
        return isOffJob;
    }

    public void setIsOffJob(Integer isOffJob) {
        this.isOffJob = isOffJob;
    }

    public Integer getIsUseWx() {
        return isUseWx;
    }

    public void setIsUseWx(Integer isUseWx) {
        this.isUseWx = isUseWx;
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

    public Long getChecker() {
        return checker;
    }

    public void setChecker(Long checker) {
        this.checker = checker;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
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

    @Override
    public String toString() {
        return "TrainInfo{" +
        "id=" + id +
        ", trainName=" + trainName +
        ", projectId=" + projectId +
        ", projectTrainId=" + projectTrainId +
        ", period=" + period +
        ", trainWay=" + trainWay +
        ", trainType=" + trainType +
        ", enrollStartTime=" + enrollStartTime +
        ", enrollEndTime=" + enrollEndTime +
        ", trainStartTime=" + trainStartTime +
        ", trainEndTime=" + trainEndTime +
        ", trainScore=" + trainScore +
        ", enrollWay=" + enrollWay +
        ", organizer=" + organizer +
        ", trainDays=" + trainDays +
        ", maxTrainNum=" + maxTrainNum +
        ", trainOrg=" + trainOrg +
        ", introduce=" + introduce +
        ", orgId=" + orgId +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", trainObject=" + trainObject +
        ", trainStatus=" + trainStatus +
        ", trainAddress=" + trainAddress +
        ", detailAddress=" + detailAddress +
        ", isOffJob=" + isOffJob +
        ", isUseWx=" + isUseWx +
        ", isPublish=" + isPublish +
        ", isDel=" + isDel +
        ", checker=" + checker +
        ", checkStatus=" + checkStatus +
        ", checkTime=" + checkTime +
        ", checkContent=" + checkContent +
        "}";
    }
}
