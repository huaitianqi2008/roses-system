package cn.stylefeng.roses.system.modular.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long userId;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户账号名
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码盐
     */
    private String salt;

    /**
     * 用户真实姓名
     */
    private String name;

    /**
     * 出生日期
     */
    private LocalDate birthday;

    /**
     * 性别： 0:女，1:男，2：未知
     */
    private Integer sex;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 状态，(1：启用，2：冻结，3：删除)
     */
    private Integer status;

    /**
     * 全日制-学历
     */
    private Integer education;

    /**
     * 最高-学历
     */
    private Integer topEducation;

    /**
     * 用户部门名称
     */
    private String orgName;

    /**
     * 所属部门标识
     */
    private Long orgId;

    /**
     * 办公电话
     */
    private String telphone;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 民族
     */
    private Integer nation;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 政治面貌
     */
    private Integer politics;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * QQ号码
     */
    private String qq;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 全日制-毕业院校
     */
    private String college;

    /**
     * 全日制-专业
     */
    private String major;

    /**
     * 人员身份(公务员，企事业单位干部等）
     */
    private Long rankId;

    /**
     * 职位名称
     */
    private String rankName;

    /**
     * 在岗情况(1：在岗，2：离职，3：退休，4：待定)
     */
    private Integer workStatus;

    /**
     * 参加工作时间
     */
    private LocalDate joinWorkTime;

    /**
     * 全日制-学位
     */
    private Integer degree;

    /**
     * 职务
     */
    private String post;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否为管理员(0:学员,1:管理员,2:既是学员也是管理员)
     */
    private Integer userType;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastLoginTime;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * 登陆失败次数
     */
    private Integer loginFailedTimes;

    /**
     * 最近一次登陆失败时间
     */
    private LocalDateTime recentlyFailedTime;

    /**
     * 领导人名称（管理员）
     */
    private String leaderName;

    /**
     * 真实姓名
     */
    private String realName;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getTopEducation() {
        return topEducation;
    }

    public void setTopEducation(Integer topEducation) {
        this.topEducation = topEducation;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getPolitics() {
        return politics;
    }

    public void setPolitics(Integer politics) {
        this.politics = politics;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Long getRankId() {
        return rankId;
    }

    public void setRankId(Long rankId) {
        this.rankId = rankId;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public Integer getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(Integer workStatus) {
        this.workStatus = workStatus;
    }

    public LocalDate getJoinWorkTime() {
        return joinWorkTime;
    }

    public void setJoinWorkTime(LocalDate joinWorkTime) {
        this.joinWorkTime = joinWorkTime;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getLoginFailedTimes() {
        return loginFailedTimes;
    }

    public void setLoginFailedTimes(Integer loginFailedTimes) {
        this.loginFailedTimes = loginFailedTimes;
    }

    public LocalDateTime getRecentlyFailedTime() {
        return recentlyFailedTime;
    }

    public void setRecentlyFailedTime(LocalDateTime recentlyFailedTime) {
        this.recentlyFailedTime = recentlyFailedTime;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "SysUser{" +
        "userId=" + userId +
        ", avatar=" + avatar +
        ", account=" + account +
        ", password=" + password +
        ", salt=" + salt +
        ", name=" + name +
        ", birthday=" + birthday +
        ", sex=" + sex +
        ", email=" + email +
        ", phone=" + phone +
        ", status=" + status +
        ", education=" + education +
        ", topEducation=" + topEducation +
        ", orgName=" + orgName +
        ", orgId=" + orgId +
        ", telphone=" + telphone +
        ", age=" + age +
        ", nation=" + nation +
        ", idCard=" + idCard +
        ", politics=" + politics +
        ", postcode=" + postcode +
        ", qq=" + qq +
        ", address=" + address +
        ", college=" + college +
        ", major=" + major +
        ", rankId=" + rankId +
        ", rankName=" + rankName +
        ", workStatus=" + workStatus +
        ", joinWorkTime=" + joinWorkTime +
        ", degree=" + degree +
        ", post=" + post +
        ", remark=" + remark +
        ", userType=" + userType +
        ", lastLoginTime=" + lastLoginTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", seq=" + seq +
        ", loginFailedTimes=" + loginFailedTimes +
        ", recentlyFailedTime=" + recentlyFailedTime +
        ", leaderName=" + leaderName +
        ", realName=" + realName +
        "}";
    }
}
