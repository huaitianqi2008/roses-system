package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 班级评估问卷用户答案表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_evalution_stu_result")
public class EvalutionStuResult implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id 自增长
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 评估问卷id
     */
    private Long evaId;

    /**
     * 调查者ID
     */
    private Long stuId;

    /**
     * 题目ID
     */
    private Long quesId;

    /**
     * 答案
     */
    private String answer;

    /**
     * 是否删除(0:否，1：是)
     */
    private Integer isDel;

    /**
     * 排序
     */
    private Integer seq;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEvaId() {
        return evaId;
    }

    public void setEvaId(Long evaId) {
        this.evaId = evaId;
    }

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public Long getQuesId() {
        return quesId;
    }

    public void setQuesId(Long quesId) {
        this.quesId = quesId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "EvalutionStuResult{" +
        "id=" + id +
        ", evaId=" + evaId +
        ", stuId=" + stuId +
        ", quesId=" + quesId +
        ", answer=" + answer +
        ", isDel=" + isDel +
        ", seq=" + seq +
        "}";
    }
}
