package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 培训班-请假表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("tb_train_leave")
public class TrainLeave implements Serializable {

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
     * 所在单位
     */
    private Long orgId;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 联系电话
     */
    private String orgName;

    /**
     * 开始时间
     */
    private LocalDateTime beginTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 请假时长（小时）
     */
    private Integer hours;

    /**
     * 请假事由
     */
    private String leaveReason;

    /**
     * 请假人id
     */
    private Long creater;

    /**
     * 请假人名
     */
    private String createrName;

    /**
     * 上传图片路径
     */
    private String fileUrl;

    /**
     * 上传图片url
     */
    private String imgUrl;

    /**
     * 是否提交（0：保存草稿，1：已提交）
     */
    private Integer isPublish;

    /**
     * 审核人id
     */
    private Long checker;

    /**
     * 申请时间
     */
    private LocalDateTime applyTime;

    /**
     * 审核状态(0:未审核，1：审核通过，2：审核不通过
     */
    private Integer checkStatus;

    /**
     * 审核理由
     */
    private String checkContent;


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

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
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

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
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

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Integer isPublish) {
        this.isPublish = isPublish;
    }

    public Long getChecker() {
        return checker;
    }

    public void setChecker(Long checker) {
        this.checker = checker;
    }

    public LocalDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(LocalDateTime applyTime) {
        this.applyTime = applyTime;
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

    @Override
    public String toString() {
        return "TrainLeave{" +
        "id=" + id +
        ", classId=" + classId +
        ", orgId=" + orgId +
        ", phone=" + phone +
        ", orgName=" + orgName +
        ", beginTime=" + beginTime +
        ", endTime=" + endTime +
        ", hours=" + hours +
        ", leaveReason=" + leaveReason +
        ", creater=" + creater +
        ", createrName=" + createrName +
        ", fileUrl=" + fileUrl +
        ", imgUrl=" + imgUrl +
        ", isPublish=" + isPublish +
        ", checker=" + checker +
        ", applyTime=" + applyTime +
        ", checkStatus=" + checkStatus +
        ", checkContent=" + checkContent +
        "}";
    }
}
