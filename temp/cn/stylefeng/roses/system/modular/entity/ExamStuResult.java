package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 考试学生答案表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_exam_stu_result")
public class ExamStuResult implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 试卷id
     */
    private Long examId;

    /**
     * 考生ID
     */
    private Long studentId;

    /**
     * 题目ID
     */
    private Long problemId;

    /**
     * 正确还是错误，0错1对(只针对单选、多选、判断题，自动改卷)
     */
    private Integer trueOrFalse;

    /**
     * 答案
     */
    private String answer;

    /**
     * 得分
     */
    private BigDecimal score;


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

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getProblemId() {
        return problemId;
    }

    public void setProblemId(Long problemId) {
        this.problemId = problemId;
    }

    public Integer getTrueOrFalse() {
        return trueOrFalse;
    }

    public void setTrueOrFalse(Integer trueOrFalse) {
        this.trueOrFalse = trueOrFalse;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ExamStuResult{" +
        "id=" + id +
        ", examId=" + examId +
        ", studentId=" + studentId +
        ", problemId=" + problemId +
        ", trueOrFalse=" + trueOrFalse +
        ", answer=" + answer +
        ", score=" + score +
        "}";
    }
}
