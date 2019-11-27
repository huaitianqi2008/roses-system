package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 培训班-作业表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_homework")
public class TrainHomework implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 班级id
     */
    private Long classId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 发布人
     */
    private Long creater;

    /**
     * 发布时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 附件路径
     */
    private String fileUrl;

    /**
     * 提交截止时间
     */
    private LocalDateTime submitEndTime;

    /**
     * 是否删除(0:否,1:是)
     */
    private Integer isDel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public LocalDateTime getSubmitEndTime() {
        return submitEndTime;
    }

    public void setSubmitEndTime(LocalDateTime submitEndTime) {
        this.submitEndTime = submitEndTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "TrainHomework{" +
        "id=" + id +
        ", classId=" + classId +
        ", title=" + title +
        ", content=" + content +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", fileUrl=" + fileUrl +
        ", submitEndTime=" + submitEndTime +
        ", isDel=" + isDel +
        "}";
    }
}
