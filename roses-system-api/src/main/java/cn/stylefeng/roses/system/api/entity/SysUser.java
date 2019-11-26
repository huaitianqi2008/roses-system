/**
 * Copyright 2018-2020 stylefeng & Hyer (sn93@qq.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.stylefeng.roses.system.api.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author stylefeng
 * @since 2018-08-26
 */
@TableName("sys_user")
@Data
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value="user_id",type = IdType.ID_WORKER)
    private Long userId;
    /**
     * 头像
     */
    @TableField("avatar")
    private String avatar;
    /**
     * 账号
     */
    @TableField("account")
    private String account;
    /**
     * 密码
     */
    @TableField("password")
    private String password;
    /**
     * md5密码盐
     */
    @TableField("salt")
    private String salt;
    /**
     * 名字
     */
    @TableField("name")
    private String name;
    /**
     * 生日
     */
    @TableField("birthday")
    private Date birthday;
    /**
     * 性别（M：男 F：女）
     */
    @TableField("sex")
    private String sex;
    /**
     * 电子邮件
     */
    @TableField("email")
    private String email;
    /**
     * 电话
     */
    @TableField("phone")
    private String phone;
    /**
     * 状态(1：启用  2：冻结  3：删除）
     */
    @TableField("status")
    private Integer status;
    /**
     * 全日制学历
     */
    @TableField("education")
    private Integer education;

    /**
     * 最高学历
     */
    @TableField("top_education")
    private Integer topEducation;

    /**
     * 机构名称
     */
    @TableField("org_name")
    private String orgName;

    /**
     * 机构id
     */
    @TableField("org_id")
    private Long orgId;

    /**
     * 办公电话（座机）
     */
    @TableField("telphone")
    private String telphone;
    /**
     * 年龄
     */
    @TableField("age")
    private Integer age;
    /**
     * 民族
     */
    @TableField("nation")
    private Integer nation;

    /**
     * 身份证号
     */
    @TableField("id_card")
    private String idCard;

    /**
     * 政治面貌
     */
    @TableField("politics")
    private Integer politics;

    /**
     * 邮编
     */
    @TableField("postcode")
    private Integer postcode;
    /**
     * QQ号码
     */
    @TableField("qq")
    private String qq;

    /**
     * 联系地址
     */
    @TableField("address")
    private String address;

    /**
     * 全日制毕业院校
     */
    @TableField("college")
    private String college;

    /**
     * 全日制专业
     */
    @TableField("major")
    private String major;

    /**
     * 职级id
     */
    @TableField("rank_id")
    private Integer rankId;

    /**
     * 职级名称
     */
    @TableField("rank_name")
    private Integer rankName;

    /**
     * 在岗状态
     */
    @TableField("work_status")
    private Integer workStatus;

    /**
     * 参加工作时间
     */
    @TableField("join_work_time")
    private Date joinWorkTime;

    /**
     * 全日制学位
     */
    @TableField("degree")
    private Integer degree;
    /**
     * 职务
     */
    @TableField("post")
    private String post;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 用户类型
     */
    @TableField("user_type")
    private Integer userType;

    /**
     * 最近登录时间
     */
    @TableField("last_login_time")
    private Date lastLoginTime;

    /**
     * 排序
     */
    @TableField("seq")
    private Integer seq;

    /**
     * 登录失败次数
     */
    @TableField("login_failed_times")
    private Integer loginFailedTimes;

    /**
     * 最近登录失败时间
     */
    @TableField("recently_failed_time")
    private Date recentlyFailedTime;

    /**
     * 领导人姓名（管理员使用）
     */
    @TableField("leader_name")
    private String leaderName;

    /**
     * 真实姓名（管理员使用）
     */
    @TableField("real_name")
    private String realName;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private Date updateTime;


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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                ", userId=" + userId +
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
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                "}";
    }
}
