package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 调查问卷-用户作答表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_quesn_stu_result")
public class QuesnStuResult implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id 自增长
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 问卷ID
     */
    private Long quesnId;

    /**
     * 问卷填写人id
     */
    private Long userId;

    /**
     * 题目ID
     */
    private Long quesId;

    /**
     * 填写答案
     */
    private String answer;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuesnId() {
        return quesnId;
    }

    public void setQuesnId(Long quesnId) {
        this.quesnId = quesnId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    @Override
    public String toString() {
        return "QuesnStuResult{" +
        "id=" + id +
        ", quesnId=" + quesnId +
        ", userId=" + userId +
        ", quesId=" + quesId +
        ", answer=" + answer +
        "}";
    }
}
