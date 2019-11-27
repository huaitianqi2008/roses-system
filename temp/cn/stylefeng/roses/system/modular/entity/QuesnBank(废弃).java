package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 问卷调查--题库表(废弃原因:考虑问卷调查实际使用基本不存在固定题目,每次建的问卷调查单独设置问卷题目可能已经可以满足需求)
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_quesn_bank(废弃)")
public class QuesnBank(废弃) implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 题目类型(1:  单选  2：多选 3：判断 4 ：问答)
     */
    private Integer questionType;

    /**
     * 题目标题
     */
    private String questionTitle;

    /**
     * 授课人（任课老师）
     */
    private String teacher;

    /**
     * 选项，用,,隔开
     */
    private String choiceItem;

    /**
     * 答案
     */
    private String answer;

    /**
     * 状态，（1：有效，0 ：无效）
     */
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 创建id
     */
    private String userId;

    /**
     * 是否删除
     */
    private Integer isDel;

    /**
     * 业务分类
     */
    private String businessType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getChoiceItem() {
        return choiceItem;
    }

    public void setChoiceItem(String choiceItem) {
        this.choiceItem = choiceItem;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @Override
    public String toString() {
        return "QuesnBank(废弃){" +
        "id=" + id +
        ", questionType=" + questionType +
        ", questionTitle=" + questionTitle +
        ", teacher=" + teacher +
        ", choiceItem=" + choiceItem +
        ", answer=" + answer +
        ", status=" + status +
        ", createTime=" + createTime +
        ", userId=" + userId +
        ", isDel=" + isDel +
        ", businessType=" + businessType +
        "}";
    }
}
