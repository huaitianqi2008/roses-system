package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 问卷调查-问卷题目表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_quesn_question")
public class QuesnQuestion implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 问卷ID
     */
    private Long quesnId;

    /**
     * 题目类型(1:  单选  2：多选 3：判断 4 ：问答)
     */
    private Integer quesType;

    /**
     * 题目内容
     */
    private String quesTitle;

    /**
     * 选项，用,,隔开
     */
    private String quesOptions;

    /**
     * 答案
     */
    private String quesAnswer;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 创建ID
     */
    private Long creater;

    /**
     * 是否删除(0:否,1:是)
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

    public Long getQuesnId() {
        return quesnId;
    }

    public void setQuesnId(Long quesnId) {
        this.quesnId = quesnId;
    }

    public Integer getQuesType() {
        return quesType;
    }

    public void setQuesType(Integer quesType) {
        this.quesType = quesType;
    }

    public String getQuesTitle() {
        return quesTitle;
    }

    public void setQuesTitle(String quesTitle) {
        this.quesTitle = quesTitle;
    }

    public String getQuesOptions() {
        return quesOptions;
    }

    public void setQuesOptions(String quesOptions) {
        this.quesOptions = quesOptions;
    }

    public String getQuesAnswer() {
        return quesAnswer;
    }

    public void setQuesAnswer(String quesAnswer) {
        this.quesAnswer = quesAnswer;
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
        return "QuesnQuestion{" +
        "id=" + id +
        ", quesnId=" + quesnId +
        ", quesType=" + quesType +
        ", quesTitle=" + quesTitle +
        ", quesOptions=" + quesOptions +
        ", quesAnswer=" + quesAnswer +
        ", createTime=" + createTime +
        ", creater=" + creater +
        ", isDel=" + isDel +
        ", seq=" + seq +
        "}";
    }
}
