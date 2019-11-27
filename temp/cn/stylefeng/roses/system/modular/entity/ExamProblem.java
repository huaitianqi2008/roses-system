package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 试卷题目表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_exam_problem")
public class ExamProblem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 考试ID
     */
    private Long examId;

    /**
     * 题目类型（1：单选，2：多选，3：判断，4：填空，5: 问答）
     */
    private Integer problemType;

    /**
     * 问题题目
     */
    private String problemTitle;

    /**
     * 选项，用,,隔开
     */
    private String problemOptions;

    /**
     * 答案
     */
    private String problemAnswer;

    /**
     * 创建人id
     */
    private Long creater;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 题目图片
     */
    private String imgUrl;

    /**
     * 题目分数
     */
    private BigDecimal problemScore;

    /**
     * 难度（1：容易，2：一般，3：困难）
     */
    private Integer difficultyType;

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

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public Integer getProblemType() {
        return problemType;
    }

    public void setProblemType(Integer problemType) {
        this.problemType = problemType;
    }

    public String getProblemTitle() {
        return problemTitle;
    }

    public void setProblemTitle(String problemTitle) {
        this.problemTitle = problemTitle;
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public BigDecimal getProblemScore() {
        return problemScore;
    }

    public void setProblemScore(BigDecimal problemScore) {
        this.problemScore = problemScore;
    }

    public Integer getDifficultyType() {
        return difficultyType;
    }

    public void setDifficultyType(Integer difficultyType) {
        this.difficultyType = difficultyType;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "ExamProblem{" +
        "id=" + id +
        ", examId=" + examId +
        ", problemType=" + problemType +
        ", problemTitle=" + problemTitle +
        ", problemOptions=" + problemOptions +
        ", problemAnswer=" + problemAnswer +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", imgUrl=" + imgUrl +
        ", problemScore=" + problemScore +
        ", difficultyType=" + difficultyType +
        ", isDel=" + isDel +
        "}";
    }
}
