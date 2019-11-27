package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 班级评估问卷题目表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_evalution_question")
public class EvalutionQuestion implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 评估问卷ID
     */
    private Long evaId;

    /**
     * 题目类型(1:  单选  2：多选 3：判断 4 ：问答)
     */
    private Integer questionType;

    /**
     * 题目内容
     */
    private String questionName;

    /**
     * 选项，用,,隔开
     */
    private String options;

    /**
     * 答案
     */
    private String answer;

    /**
     * 创建ID
     */
    private Long creater;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 是否删除（0：否，1:是）
     */
    private Integer isDel;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * 业务分类id
     */
    private Long businessTypeId;


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

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Long getBusinessTypeId() {
        return businessTypeId;
    }

    public void setBusinessTypeId(Long businessTypeId) {
        this.businessTypeId = businessTypeId;
    }

    @Override
    public String toString() {
        return "EvalutionQuestion{" +
        "id=" + id +
        ", evaId=" + evaId +
        ", questionType=" + questionType +
        ", questionName=" + questionName +
        ", options=" + options +
        ", answer=" + answer +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", isDel=" + isDel +
        ", seq=" + seq +
        ", businessTypeId=" + businessTypeId +
        "}";
    }
}
