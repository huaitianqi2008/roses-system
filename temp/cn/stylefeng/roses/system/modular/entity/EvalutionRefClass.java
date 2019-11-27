package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 班级评估问卷与班级关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_evalution_ref_class")
public class EvalutionRefClass implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 评估问卷id
     */
    private Long evalutionId;

    /**
     * 班级id
     */
    private Long classId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEvalutionId() {
        return evalutionId;
    }

    public void setEvalutionId(Long evalutionId) {
        this.evalutionId = evalutionId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "EvalutionRefClass{" +
        "id=" + id +
        ", evalutionId=" + evalutionId +
        ", classId=" + classId +
        "}";
    }
}
