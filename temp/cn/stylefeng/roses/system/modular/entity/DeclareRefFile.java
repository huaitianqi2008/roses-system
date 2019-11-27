package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 申报学分-资料关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_declare_ref_file")
public class DeclareRefFile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 申报学分表id
     */
    private Long declareId;

    /**
     * 资料存放路径
     */
    private String fileUrl;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeclareId() {
        return declareId;
    }

    public void setDeclareId(Long declareId) {
        this.declareId = declareId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public String toString() {
        return "DeclareRefFile{" +
        "id=" + id +
        ", declareId=" + declareId +
        ", fileUrl=" + fileUrl +
        "}";
    }
}
