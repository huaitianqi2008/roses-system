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
 * 年度学分计划表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_credit_yearplan")
public class CreditYearplan implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 计划年份
     */
    private String planYear;

    /**
     * 网上学分
     */
    private BigDecimal onlineScore;

    /**
     * 脱产学分
     */
    private BigDecimal offjobScore;

    /**
     * 职级id
     */
    private Long rankId;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 是否删除（0:否,1:是）
     */
    private Integer isDel;

    /**
     * 学期开始时间
     */
    private LocalDate beginTime;

    /**
     * 学期结束时间
     */
    private LocalDate endTime;

    /**
     * 补考开始时间
     */
    private LocalDate reBeginTime;

    /**
     * 补考结束时间
     */
    private LocalDate reEndTime;

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

    public String getPlanYear() {
        return planYear;
    }

    public void setPlanYear(String planYear) {
        this.planYear = planYear;
    }

    public BigDecimal getOnlineScore() {
        return onlineScore;
    }

    public void setOnlineScore(BigDecimal onlineScore) {
        this.onlineScore = onlineScore;
    }

    public BigDecimal getOffjobScore() {
        return offjobScore;
    }

    public void setOffjobScore(BigDecimal offjobScore) {
        this.offjobScore = offjobScore;
    }

    public Long getRankId() {
        return rankId;
    }

    public void setRankId(Long rankId) {
        this.rankId = rankId;
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

    public LocalDate getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDate beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public LocalDate getReBeginTime() {
        return reBeginTime;
    }

    public void setReBeginTime(LocalDate reBeginTime) {
        this.reBeginTime = reBeginTime;
    }

    public LocalDate getReEndTime() {
        return reEndTime;
    }

    public void setReEndTime(LocalDate reEndTime) {
        this.reEndTime = reEndTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "CreditYearplan{" +
        "id=" + id +
        ", planYear=" + planYear +
        ", onlineScore=" + onlineScore +
        ", offjobScore=" + offjobScore +
        ", rankId=" + rankId +
        ", createTime=" + createTime +
        ", isDel=" + isDel +
        ", beginTime=" + beginTime +
        ", endTime=" + endTime +
        ", reBeginTime=" + reBeginTime +
        ", reEndTime=" + reEndTime +
        ", remark=" + remark +
        "}";
    }
}
