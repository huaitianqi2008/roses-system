package cn.stylefeng.roses.system.modular.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 文件信息表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
public class SysFileinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件ID
     */
    @TableId("FILE_ID")
    private String fileId;

    /**
     * 应用编码
     */
    @TableField("APP_CODE")
    private String appCode;

    /**
     * 文件路径
     */
    @TableField("FILE_URL")
    private String fileUrl;

    /**
     * 文件名称
     */
    @TableField("FILE_ORIGIN_NAME")
    private String fileOriginName;

    /**
     * 文件后缀
     */
    @TableField("FILE_SUFFIX")
    private String fileSuffix;

    /**
     * 文件大小
     */
    @TableField("FILE_SIZE")
    private BigDecimal fileSize;

    /**
     * 文件唯一名称
     */
    @TableField("FILE_STORAGE_NAME")
    private String fileStorageName;

    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(value = "UPDATE_TIME", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileOriginName() {
        return fileOriginName;
    }

    public void setFileOriginName(String fileOriginName) {
        this.fileOriginName = fileOriginName;
    }

    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileStorageName() {
        return fileStorageName;
    }

    public void setFileStorageName(String fileStorageName) {
        this.fileStorageName = fileStorageName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysFileinfo{" +
        "fileId=" + fileId +
        ", appCode=" + appCode +
        ", fileUrl=" + fileUrl +
        ", fileOriginName=" + fileOriginName +
        ", fileSuffix=" + fileSuffix +
        ", fileSize=" + fileSize +
        ", fileStorageName=" + fileStorageName +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
