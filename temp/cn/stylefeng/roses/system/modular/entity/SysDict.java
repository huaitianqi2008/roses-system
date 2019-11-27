package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 常用字典表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
public class SysDict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("DICT_ID")
    private Long dictId;

    /**
     * 字典类型编码
     */
    @TableField("DICT_TYPE_CODE")
    private String dictTypeCode;

    /**
     * 字典编码
     */
    @TableField("DICT_CODE")
    private String dictCode;

    @TableField("DICT_NAME")
    private String dictName;

    /**
     * 字典分类描述
     */
    @TableField("DICT_SHORT_NAME")
    private String dictShortName;

    /**
     * 父节点ID
     */
    @TableField("DICT_SHORT_CODE")
    private String dictShortCode;

    /**
     * 上级id
     */
    @TableField("PARENT_ID")
    private Long parentId;

    /**
     * 状态(1:启用,2:禁用)
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(value = "UPDATE_TIME", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    /**
     * 排序
     */
    @TableField("SEQ")
    private Integer seq;


    public Long getDictId() {
        return dictId;
    }

    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    public String getDictTypeCode() {
        return dictTypeCode;
    }

    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictShortName() {
        return dictShortName;
    }

    public void setDictShortName(String dictShortName) {
        this.dictShortName = dictShortName;
    }

    public String getDictShortCode() {
        return dictShortCode;
    }

    public void setDictShortCode(String dictShortCode) {
        this.dictShortCode = dictShortCode;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "SysDict{" +
        "dictId=" + dictId +
        ", dictTypeCode=" + dictTypeCode +
        ", dictCode=" + dictCode +
        ", dictName=" + dictName +
        ", dictShortName=" + dictShortName +
        ", dictShortCode=" + dictShortCode +
        ", parentId=" + parentId +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", seq=" + seq +
        "}";
    }
}
