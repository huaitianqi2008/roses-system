package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 年度学分时间设置表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_credit_time_setting")
public class CreditTimeSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 计划年份
     */
    private Long planYear;

    /**
     * 创建人id
     */
    private Long creater;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新人id
     */
    private Long updater;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlanYear() {
        return planYear;
    }

    public void setPlanYear(Long planYear) {
        this.planYear = planYear;
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

    public Long getUpdater() {
        return updater;
    }

    public void setUpdater(Long updater) {
        this.updater = updater;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
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

    @Override
    public String toString() {
        return "CreditTimeSetting{" +
        "id=" + id +
        ", planYear=" + planYear +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", updater=" + updater +
        ", updateTime=" + updateTime +
        ", beginTime=" + beginTime +
        ", endTime=" + endTime +
        ", reBeginTime=" + reBeginTime +
        ", reEndTime=" + reEndTime +
        "}";
    }
}
