package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 培训班-作业提交表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_homework_submit")
public class TrainHomeworkSubmit implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 作业id
     */
    private Long homewkId;

    /**
     * 班级id
     */
    private Long classId;

    /**
     * 学生用户id
     */
    private Long studentId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 附件
     */
    private String fileUrl;

    /**
     * 提交时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 是否删除（0：否，1：是）
     */
    private Integer isDel;

    /**
     * 提交否(1:提交，2：保存)
     */
    private Integer isSubmit;

    /**
     * 批改id
     */
    private Long checker;

    /**
     * 审核时间
     */
    private LocalDateTime checkTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHomewkId() {
        return homewkId;
    }

    public void setHomewkId(Long homewkId) {
        this.homewkId = homewkId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
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

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
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

    public Integer getIsSubmit() {
        return isSubmit;
    }

    public void setIsSubmit(Integer isSubmit) {
        this.isSubmit = isSubmit;
    }

    public Long getChecker() {
        return checker;
    }

    public void setChecker(Long checker) {
        this.checker = checker;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    @Override
    public String toString() {
        return "TrainHomeworkSubmit{" +
        "id=" + id +
        ", homewkId=" + homewkId +
        ", classId=" + classId +
        ", studentId=" + studentId +
        ", title=" + title +
        ", content=" + content +
        ", fileUrl=" + fileUrl +
        ", createTime=" + createTime +
        ", isDel=" + isDel +
        ", isSubmit=" + isSubmit +
        ", checker=" + checker +
        ", checkTime=" + checkTime +
        "}";
    }
}
