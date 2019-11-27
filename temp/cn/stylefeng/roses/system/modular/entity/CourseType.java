package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 课程分类表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_course_type")
public class CourseType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 父类id
     */
    private Long pId;

    /**
     * 分类名字
     */
    private String typeName;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * 是否删除（0:否,1:是）
     */
    private Integer isDel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
        return "CourseType{" +
        "id=" + id +
        ", pId=" + pId +
        ", typeName=" + typeName +
        ", seq=" + seq +
        ", isDel=" + isDel +
        "}";
    }
}
