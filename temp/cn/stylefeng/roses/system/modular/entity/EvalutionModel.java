package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 评教类别表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_evalution_model")
public class EvalutionModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 模块名称
     */
    private String modelName;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private Long creater;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * 是否删除（0：否，1：是）
     */
    private Integer isDel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "EvalutionModel{" +
        "id=" + id +
        ", modelName=" + modelName +
        ", createTime=" + createTime +
        ", creater=" + creater +
        ", seq=" + seq +
        ", isDel=" + isDel +
        "}";
    }
}
