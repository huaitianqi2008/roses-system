package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 培训计划班级表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_plan_class")
public class PlanClass implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 计划id
     */
    private Long planId;

    /**
     * 名称
     */
    private String trainName;

    /**
     * 计划培训费用
     */
    private BigDecimal trainCost;

    /**
     * 计划培训开班时间
     */
    private LocalDateTime beginTime;

    /**
     * 计划培训结班时间
     */
    private LocalDateTime endTime;

    /**
     * 计划经济来源
     */
    private String ecoSource;

    /**
     * 计划承办机构
     */
    private String orgName;

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
     * 是否已被培训班使用(0:没有，1：有）
     */
    private Integer isUsed;

    /**
     * 创建人id
     */
    private Long creater;

    /**
     * 主办单位id
     */
    private Long mainOrgId;

    /**
     * 调训对象
     */
    private String trainObject;

    /**
     * 计划培训人数
     */
    private Integer planTrianNum;

    /**
     * 是否包含领导班子成员（0：不包含，1：县区，2：镇街，3：村居）
     */
    private String isContainLeader;

    /**
     * 计划班级审核状态（0：不通过，1：通过，2：未审核）
     */
    private Integer checkStatus;

    /**
     * 审核人id
     */
    private String checker;

    /**
     * 审核时间
     */
    private LocalDateTime checkTime;

    /**
     * 排序号
     */
    private Integer seq;

    /**
     * 修改更新内容
     */
    private String updateContent;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public BigDecimal getTrainCost() {
        return trainCost;
    }

    public void setTrainCost(BigDecimal trainCost) {
        this.trainCost = trainCost;
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

    public String getEcoSource() {
        return ecoSource;
    }

    public void setEcoSource(String ecoSource) {
        this.ecoSource = ecoSource;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
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

    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Long getMainOrgId() {
        return mainOrgId;
    }

    public void setMainOrgId(Long mainOrgId) {
        this.mainOrgId = mainOrgId;
    }

    public String getTrainObject() {
        return trainObject;
    }

    public void setTrainObject(String trainObject) {
        this.trainObject = trainObject;
    }

    public Integer getPlanTrianNum() {
        return planTrianNum;
    }

    public void setPlanTrianNum(Integer planTrianNum) {
        this.planTrianNum = planTrianNum;
    }

    public String getIsContainLeader() {
        return isContainLeader;
    }

    public void setIsContainLeader(String isContainLeader) {
        this.isContainLeader = isContainLeader;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getUpdateContent() {
        return updateContent;
    }

    public void setUpdateContent(String updateContent) {
        this.updateContent = updateContent;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "PlanClass{" +
        "id=" + id +
        ", planId=" + planId +
        ", trainName=" + trainName +
        ", trainCost=" + trainCost +
        ", beginTime=" + beginTime +
        ", endTime=" + endTime +
        ", ecoSource=" + ecoSource +
        ", orgName=" + orgName +
        ", createTime=" + createTime +
        ", isDel=" + isDel +
        ", isUsed=" + isUsed +
        ", creater=" + creater +
        ", mainOrgId=" + mainOrgId +
        ", trainObject=" + trainObject +
        ", planTrianNum=" + planTrianNum +
        ", isContainLeader=" + isContainLeader +
        ", checkStatus=" + checkStatus +
        ", checker=" + checker +
        ", checkTime=" + checkTime +
        ", seq=" + seq +
        ", updateContent=" + updateContent +
        ", updateTime=" + updateTime +
        "}";
    }
}
