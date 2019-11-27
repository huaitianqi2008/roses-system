package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 培训班-班级和省网课程关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_ref_prov_course")
public class TrainRefProvCourse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 班级id
     */
    private Long classId;

    /**
     * 线下课程id
     */
    private Long courseId;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 是否删除（0：否；1：是）
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

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "TrainRefProvCourse{" +
        "id=" + id +
        ", classId=" + classId +
        ", courseId=" + courseId +
        ", courseName=" + courseName +
        ", isDel=" + isDel +
        "}";
    }
}
