package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 班级评估题库表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_evalution_question_bank")
public class EvalutionQuestionBank implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 评估模板id
     */
    private Long modelId;

    /**
     * 业务类型id
     */
    private Long businessTypeId;

    /**
     * 题目类型(1:  单选  2：多选 3：判断 4 ：问答)
     */
    private Integer questionType;

    /**
     * 题目内容
     */
    private String title;

    /**
     * 选项（用,,隔开）
     */
    private String options;

    /**
     * 答案
     */
    private String answer;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 创建id
     */
    private Long creater;

    /**
     * 是否删除
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

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getBusinessTypeId() {
        return businessTypeId;
    }

    public void setBusinessTypeId(Long businessTypeId) {
        this.businessTypeId = businessTypeId;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "EvalutionQuestionBank{" +
        "id=" + id +
        ", modelId=" + modelId +
        ", businessTypeId=" + businessTypeId +
        ", questionType=" + questionType +
        ", title=" + title +
        ", options=" + options +
        ", answer=" + answer +
        ", createTime=" + createTime +
        ", creater=" + creater +
        ", isDel=" + isDel +
        ", seq=" + seq +
        "}";
    }
}
