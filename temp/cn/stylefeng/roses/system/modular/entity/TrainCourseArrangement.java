package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 培训班-课程安排导入文件
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_course_arrangement")
public class TrainCourseArrangement implements Serializable {

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
     * 课程路径
     */
    private String fileUrl;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 创建人id
     */
    private Long creater;

    /**
     * 是否删除（0：否，1：是）
     */
    private Integer isDel;

    /**
     * 审核人
     */
    private String checker;

    /**
     * 审核状态（0：审核不通过，1：审核通过，2：待审核）
     */
    private Integer checkStatus;

    /**
     * 审核内容
     */
    private String checkContent;

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

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
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

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getCheckContent() {
        return checkContent;
    }

    public void setCheckContent(String checkContent) {
        this.checkContent = checkContent;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    @Override
    public String toString() {
        return "TrainCourseArrangement{" +
        "id=" + id +
        ", classId=" + classId +
        ", fileUrl=" + fileUrl +
        ", createTime=" + createTime +
        ", creater=" + creater +
        ", isDel=" + isDel +
        ", checker=" + checker +
        ", checkStatus=" + checkStatus +
        ", checkContent=" + checkContent +
        ", checkTime=" + checkTime +
        "}";
    }
}
