package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 考试题库表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_exam_problem_bank")
public class ExamProblemBank implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 题型（1：单选，2：多选，3：判断，4：填空，5：简答）
     */
    private Integer problemType;

    /**
     * 知识分类ID
     */
    private Long knowledgeId;

    /**
     * 问题内容
     */
    private String problemContent;

    /**
     * 选项，用,,隔开
     */
    private String problemOptions;

    /**
     * 答案
     */
    private String problemAnswer;

    /**
     * 难度（1：容易，2：一般，3：困难）
     */
    private Integer difficultyType;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 是否删除(0:否，1：是）
     */
    private Integer isDel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProblemType() {
        return problemType;
    }

    public void setProblemType(Integer problemType) {
        this.problemType = problemType;
    }

    public Long getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getProblemContent() {
        return problemContent;
    }

    public void setProblemContent(String problemContent) {
        this.problemContent = problemContent;
    }

    public String getProblemOptions() {
        return problemOptions;
    }

    public void setProblemOptions(String problemOptions) {
        this.problemOptions = problemOptions;
    }

    public String getProblemAnswer() {
        return problemAnswer;
    }

    public void setProblemAnswer(String problemAnswer) {
        this.problemAnswer = problemAnswer;
    }

    public Integer getDifficultyType() {
        return difficultyType;
    }

    public void setDifficultyType(Integer difficultyType) {
        this.difficultyType = difficultyType;
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

    @Override
    public String toString() {
        return "ExamProblemBank{" +
        "id=" + id +
        ", problemType=" + problemType +
        ", knowledgeId=" + knowledgeId +
        ", problemContent=" + problemContent +
        ", problemOptions=" + problemOptions +
        ", problemAnswer=" + problemAnswer +
        ", difficultyType=" + difficultyType +
        ", createTime=" + createTime +
        ", isDel=" + isDel +
        "}";
    }
}
