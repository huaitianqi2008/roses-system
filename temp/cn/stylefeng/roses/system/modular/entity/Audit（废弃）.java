package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 审核记录表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_audit（废弃）")
public class Audit（废弃） implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 审核类型(0:培训班,1:学员报名培训班,2:学分申报审核)
     */
    private Integer auditType;

    /**
     * 受审核id
     */
    private String applicantId;

    /**
     * 审核人
     */
    private String checkUserId;

    /**
     * 审核时间
     */
    private LocalDateTime checkTime;

    /**
     * 审核内容
     */
    private String content;

    /**
     * 审核状态(0:不通过,1:通过,2:待审核)
     */
    private Integer status;

    /**
     * 是否删除(0:否,1:是)
     */
    private Integer isDel;

    /**
     * 受审核人id
     */
    private String upUserId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAuditType() {
        return auditType;
    }

    public void setAuditType(Integer auditType) {
        this.auditType = auditType;
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
    }

    public String getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(String checkUserId) {
        this.checkUserId = checkUserId;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getUpUserId() {
        return upUserId;
    }

    public void setUpUserId(String upUserId) {
        this.upUserId = upUserId;
    }

    @Override
    public String toString() {
        return "Audit（废弃）{" +
        "id=" + id +
        ", auditType=" + auditType +
        ", applicantId=" + applicantId +
        ", checkUserId=" + checkUserId +
        ", checkTime=" + checkTime +
        ", content=" + content +
        ", status=" + status +
        ", isDel=" + isDel +
        ", upUserId=" + upUserId +
        "}";
    }
}
