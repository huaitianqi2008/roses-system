package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 培训班-班级资料关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_ref_file")
public class TrainRefFile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 课程id
     */
    private Long classId;

    /**
     * 文件类型(1：培训方案，2：批复文件，3：补充说明，4：延迟提交说明，5：结班文件）6：其他
     */
    private Integer fileType;

    /**
     * 资料上传路径
     */
    private String fileUrl;


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

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public String toString() {
        return "TrainRefFile{" +
        "id=" + id +
        ", classId=" + classId +
        ", fileType=" + fileType +
        ", fileUrl=" + fileUrl +
        "}";
    }
}
