package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 培训班-线下课程表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_offline_course")
public class TrainOfflineCourse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 班级ID
     */
    private Long classId;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 主讲人
     */
    private String teacherName;

    /**
     * 教师类别（0：外请专家；1：部门领导；2：校内教师）
     */
    private Integer teacherType;

    /**
     * 考勤开始时间
     */
    private LocalDateTime beginTime;

    /**
     * 考勤结束时间
     */
    private LocalDateTime endTime;

    /**
     * 创建人
     */
    private Long creater;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

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

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(Integer teacherType) {
        this.teacherType = teacherType;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
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

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "TrainOfflineCourse{" +
        "id=" + id +
        ", classId=" + classId +
        ", courseName=" + courseName +
        ", teacherName=" + teacherName +
        ", teacherType=" + teacherType +
        ", beginTime=" + beginTime +
        ", endTime=" + endTime +
        ", creater=" + creater +
        ", createTime=" + createTime +
        ", isDel=" + isDel +
        "}";
    }
}
