package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 调查问卷-用户关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_quesn_ref_stu")
public class QuesnRefStu implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 问卷ID
     */
    private Long quesnId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 答题开始时间
     */
    private LocalDateTime beginTime;

    /**
     * 答题结束时间
     */
    private LocalDateTime endTime;

    /**
     * 答题状态(0:未开始、1:作答中、2:已结束) 
     */
    private Integer status;

    /**
     * 提交时间
     */
    private LocalDateTime submitTime;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 是否删除
     */
    private Integer isDel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuesnId() {
        return quesnId;
    }

    public void setQuesnId(Long quesnId) {
        this.quesnId = quesnId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(LocalDateTime submitTime) {
        this.submitTime = submitTime;
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

    @Override
    public String toString() {
        return "QuesnRefStu{" +
        "id=" + id +
        ", quesnId=" + quesnId +
        ", userId=" + userId +
        ", beginTime=" + beginTime +
        ", endTime=" + endTime +
        ", status=" + status +
        ", submitTime=" + submitTime +
        ", createTime=" + createTime +
        ", isDel=" + isDel +
        "}";
    }
}
