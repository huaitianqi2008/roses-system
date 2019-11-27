package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 培训班-班主任信息表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_teacher")
public class TrainTeacher implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 班级id
     */
    private Long classId;

    /**
     * 教师对应管理员id
     */
    private Long teacherId;


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

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "TrainTeacher{" +
        "id=" + id +
        ", classId=" + classId +
        ", teacherId=" + teacherId +
        "}";
    }
}
