package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 省网课程考试题目和学生答案表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_exam_province_problem")
public class ExamProvinceProblem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 试卷ID
     */
    private Long examProvinceId;

    /**
     * 题目id
     */
    private Long problemId;

    /**
     * 题目标题
     */
    private String problemTitle;

    /**
     * 题目类型
     */
    private String problemType;

    /**
     * 选项
     */
    private String problemOptions;

    /**
     * 正确还是错误，0错1对
     */
    private Integer trueOrFalse;

    /**
     * 用户答案
     */
    private String studentAnswer;

    /**
     * 问题答案
     */
    private String trueAnswer;

    /**
     * 题目分数
     */
    private BigDecimal problemScore;

    /**
     * 排序号
     */
    private Integer seq;

    /**
     * 学员得分（目前省网课程只有选择题，对或错即是题目可获分数，此字段备用）
     */
    private BigDecimal getScore;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExamProvinceId() {
        return examProvinceId;
    }

    public void setExamProvinceId(Long examProvinceId) {
        this.examProvinceId = examProvinceId;
    }

    public Long getProblemId() {
        return problemId;
    }

    public void setProblemId(Long problemId) {
        this.problemId = problemId;
    }

    public String getProblemTitle() {
        return problemTitle;
    }

    public void setProblemTitle(String problemTitle) {
        this.problemTitle = problemTitle;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    public String getProblemOptions() {
        return problemOptions;
    }

    public void setProblemOptions(String problemOptions) {
        this.problemOptions = problemOptions;
    }

    public Integer getTrueOrFalse() {
        return trueOrFalse;
    }

    public void setTrueOrFalse(Integer trueOrFalse) {
        this.trueOrFalse = trueOrFalse;
    }

    public String getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(String studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    public String getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(String trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public BigDecimal getProblemScore() {
        return problemScore;
    }

    public void setProblemScore(BigDecimal problemScore) {
        this.problemScore = problemScore;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public BigDecimal getGetScore() {
        return getScore;
    }

    public void setGetScore(BigDecimal getScore) {
        this.getScore = getScore;
    }

    @Override
    public String toString() {
        return "ExamProvinceProblem{" +
        "id=" + id +
        ", examProvinceId=" + examProvinceId +
        ", problemId=" + problemId +
        ", problemTitle=" + problemTitle +
        ", problemType=" + problemType +
        ", problemOptions=" + problemOptions +
        ", trueOrFalse=" + trueOrFalse +
        ", studentAnswer=" + studentAnswer +
        ", trueAnswer=" + trueAnswer +
        ", problemScore=" + problemScore +
        ", seq=" + seq +
        ", getScore=" + getScore +
        "}";
    }
}
