package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 班级评估题目业务类型表(该类型为某模版分类下的业务分类)
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_evalution_business_type")
public class EvalutionBusinessType implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 模版id
     */
    private Long modelId;

    /**
     * 题目业务类型名称
     */
    private String businessName;

    /**
     * 描述
     */
    private String remark;

    /**
     * 是否删除(0:未删除,1:已删除)  删除该类型前需判断是否已有对应的题目.
     */
    private Integer isDel;

    /**
     * 创建人
     */
    private String creater;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 排序
     */
    private Integer seq;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "EvalutionBusinessType{" +
        "id=" + id +
        ", modelId=" + modelId +
        ", businessName=" + businessName +
        ", remark=" + remark +
        ", isDel=" + isDel +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", seq=" + seq +
        "}";
    }
}
