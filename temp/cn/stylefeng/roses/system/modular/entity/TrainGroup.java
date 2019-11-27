package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 班级群表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_group")
public class TrainGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 班级id
     */
    private Long classId;

    /**
     * 班级名称
     */
    private String trainName;

    /**
     * 路径
     */
    private String imgUrl;

    /**
     * 是否删除（0：否，1：是）
     */
    private Integer isDel;

    /**
     * 创建人id
     */
    private Long creater;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;


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

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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

    @Override
    public String toString() {
        return "TrainGroup{" +
        "id=" + id +
        ", classId=" + classId +
        ", trainName=" + trainName +
        ", imgUrl=" + imgUrl +
        ", isDel=" + isDel +
        ", creater=" + creater +
        ", createTime=" + createTime +
        "}";
    }
}
