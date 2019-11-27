package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 问卷调查--信息表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_quesn_info")
public class QuesnInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 调查问卷名字
     */
    private String quesnName;

    /**
     * 问卷开始时间
     */
    private LocalDateTime beginTime;

    /**
     * 问卷结束时间
     */
    private LocalDateTime endTime;

    /**
     * 问卷调查类型（1：单位，2：班级学员，3：课程学员，4：职级，5：指定对象）
     */
    private Integer quesnType;

    /**
     * 是否发布
     */
    private Integer isPublish;

    /**
     * 发布时间
     */
    private LocalDateTime publishTime;

    /**
     * 说明
     */
    private String remark;

    /**
     * 创建者id
     */
    private Long creater;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 是否删除(0:否1:是)
     */
    private Integer isDel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuesnName() {
        return quesnName;
    }

    public void setQuesnName(String quesnName) {
        this.quesnName = quesnName;
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

    public Integer getQuesnType() {
        return quesnType;
    }

    public void setQuesnType(Integer quesnType) {
        this.quesnType = quesnType;
    }

    public Integer getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Integer isPublish) {
        this.isPublish = isPublish;
    }

    public LocalDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "QuesnInfo{" +
        "id=" + id +
        ", quesnName=" + quesnName +
        ", beginTime=" + beginTime +
        ", endTime=" + endTime +
        ", quesnType=" + quesnType +
        ", isPublish=" + isPublish +
        ", publishTime=" + publishTime +
        ", remark=" + remark +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", isDel=" + isDel +
        "}";
    }
}
