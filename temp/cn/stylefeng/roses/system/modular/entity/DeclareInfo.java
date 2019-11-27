package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 申报学分表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_declare_info")
public class DeclareInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 培训形式(1：全脱产，2：半脱产，3：不脱产，4：不确定）
     */
    private Integer trainType;

    /**
     * 培训班名称
     */
    private String trainclassName;

    /**
     * 承办单位
     */
    private String undertakeOrg;

    /**
     * 主办单位ID
     */
    private Long hostOrgId;

    /**
     * 主办单位
     */
    private String hostOrg;

    /**
     * 调训对象
     */
    private String trainObject;

    /**
     * 培训开始时间
     */
    private LocalDate trainStarttime;

    /**
     * 培训结束时间
     */
    private LocalDate trainEndtime;

    /**
     * 申请日期
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 培训地点
     */
    private String trainAddr;

    /**
     * 培训学分
     */
    private BigDecimal trainScore;

    /**
     * 培训内容
     */
    private String content;

    /**
     * 创建者
     */
    private Long creater;

    /**
     * 创建人所在单位id
     */
    private Long orgId;

    /**
     * 审核状态(0:审核不通过，1：审核通过，2：未审核)
     */
    private Integer checkStatus;

    /**
     * 审核意见
     */
    private String checkContent;

    /**
     * 审核人id
     */
    private Long checker;

    /**
     * 审核时间
     */
    private LocalDateTime checkTime;

    /**
     * 是否发布（0：否，1：是）
     */
    private Integer isPublish;

    /**
     * 是否包含领导班子成员（0：不包含，1：县区，2：镇街，3：村居）
     */
    private String isContainLeader;

    /**
     * 删除(0:否,1:是）
     */
    private Integer isDel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTrainType() {
        return trainType;
    }

    public void setTrainType(Integer trainType) {
        this.trainType = trainType;
    }

    public String getTrainclassName() {
        return trainclassName;
    }

    public void setTrainclassName(String trainclassName) {
        this.trainclassName = trainclassName;
    }

    public String getUndertakeOrg() {
        return undertakeOrg;
    }

    public void setUndertakeOrg(String undertakeOrg) {
        this.undertakeOrg = undertakeOrg;
    }

    public Long getHostOrgId() {
        return hostOrgId;
    }

    public void setHostOrgId(Long hostOrgId) {
        this.hostOrgId = hostOrgId;
    }

    public String getHostOrg() {
        return hostOrg;
    }

    public void setHostOrg(String hostOrg) {
        this.hostOrg = hostOrg;
    }

    public String getTrainObject() {
        return trainObject;
    }

    public void setTrainObject(String trainObject) {
        this.trainObject = trainObject;
    }

    public LocalDate getTrainStarttime() {
        return trainStarttime;
    }

    public void setTrainStarttime(LocalDate trainStarttime) {
        this.trainStarttime = trainStarttime;
    }

    public LocalDate getTrainEndtime() {
        return trainEndtime;
    }

    public void setTrainEndtime(LocalDate trainEndtime) {
        this.trainEndtime = trainEndtime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getTrainAddr() {
        return trainAddr;
    }

    public void setTrainAddr(String trainAddr) {
        this.trainAddr = trainAddr;
    }

    public BigDecimal getTrainScore() {
        return trainScore;
    }

    public void setTrainScore(BigDecimal trainScore) {
        this.trainScore = trainScore;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    public Long getChecker() {
        return checker;
    }

    public void setChecker(Long checker) {
        this.checker = checker;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    public Integer getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Integer isPublish) {
        this.isPublish = isPublish;
    }

    public String getIsContainLeader() {
        return isContainLeader;
    }

    public void setIsContainLeader(String isContainLeader) {
        this.isContainLeader = isContainLeader;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "DeclareInfo{" +
        "id=" + id +
        ", trainType=" + trainType +
        ", trainclassName=" + trainclassName +
        ", undertakeOrg=" + undertakeOrg +
        ", hostOrgId=" + hostOrgId +
        ", hostOrg=" + hostOrg +
        ", trainObject=" + trainObject +
        ", trainStarttime=" + trainStarttime +
        ", trainEndtime=" + trainEndtime +
        ", createTime=" + createTime +
        ", trainAddr=" + trainAddr +
        ", trainScore=" + trainScore +
        ", content=" + content +
        ", creater=" + creater +
        ", orgId=" + orgId +
        ", checkStatus=" + checkStatus +
        ", checkContent=" + checkContent +
        ", checker=" + checker +
        ", checkTime=" + checkTime +
        ", isPublish=" + isPublish +
        ", isContainLeader=" + isContainLeader +
        ", isDel=" + isDel +
        "}";
    }
}
