package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 站内信附件关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_biz_mail_ref_file")
public class BizMailRefFile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 站内信id
     */
    private Long mailId;

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

    public Long getMailId() {
        return mailId;
    }

    public void setMailId(Long mailId) {
        this.mailId = mailId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public String toString() {
        return "BizMailRefFile{" +
        "id=" + id +
        ", mailId=" + mailId +
        ", fileUrl=" + fileUrl +
        "}";
    }
}
