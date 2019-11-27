package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 培训班-离队管理表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_leave_team")
public class TrainLeaveTeam implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 班级id
     */
    private Long classId;

    /**
     * 离队人id
     */
    private Long creater;

    private String createrName;

    /**
     * 离队理由
     */
    private String leaveReason;

    /**
     * 所在单位
     */
    private Long orgId;

    private String orgName;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 图片上传路径
     */
    private String imgUrl;

    private String fileUrl;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 是否提交（0:未提交（草稿状态），1：已提交）
     */
    private Integer isSubmit;

    /**
     * 审核人用户id
     */
    private String checker;

    /**
     * 审核状态(0:审核不通过,1:已通过审核，2:未审核)
     */
    private Integer checkStatue;

    /**
     * 审批理由
     */
    private String checkReason;

    /**
     * 审批时间
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

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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

    public Integer getIsSubmit() {
        return isSubmit;
    }

    public void setIsSubmit(Integer isSubmit) {
        this.isSubmit = isSubmit;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public Integer getCheckStatue() {
        return checkStatue;
    }

    public void setCheckStatue(Integer checkStatue) {
        this.checkStatue = checkStatue;
    }

    public String getCheckReason() {
        return checkReason;
    }

    public void setCheckReason(String checkReason) {
        this.checkReason = checkReason;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    @Override
    public String toString() {
        return "TrainLeaveTeam{" +
        "id=" + id +
        ", classId=" + classId +
        ", creater=" + creater +
        ", createrName=" + createrName +
        ", leaveReason=" + leaveReason +
        ", orgId=" + orgId +
        ", orgName=" + orgName +
        ", phone=" + phone +
        ", imgUrl=" + imgUrl +
        ", fileUrl=" + fileUrl +
        ", createTime=" + createTime +
        ", isSubmit=" + isSubmit +
        ", checker=" + checker +
        ", checkStatue=" + checkStatue +
        ", checkReason=" + checkReason +
        ", checkTime=" + checkTime +
        "}";
    }
}
