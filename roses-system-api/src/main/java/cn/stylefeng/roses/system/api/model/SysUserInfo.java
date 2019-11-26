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
package cn.stylefeng.roses.system.api.model;

import lombok.Data;

import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Hyer
 * @since 2018-08-26
 */
@Data
public class SysUserInfo {

    /**
     * 主键id
     */
    private Long userId;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * md5密码盐
     */
    private String salt;
    /**
     * 名字
     */
    private String name;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 性别（M：男 F：女）
     */
    private String sex;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
    /**
     * 状态(1：启用  2：冻结  3：删除）
     */
    private Integer status;
    /**
     * 全日制学历
     */
    private Integer education;

    /**
     * 最高学历
     */
    private Integer topEducation;

    /**
     * 机构名称
     */
    private String orgName;

    /**
     * 机构id
     */
    private Long orgId;

    /**
     * 办公电话（座机）
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
     * 身份证号
     */
    private String idCard;

    /**
     * 政治面貌
     */
    private Integer politics;

    /**
     * 邮编
     */
    private Integer postcode;
    /**
     * QQ号码
     */
    private String qq;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 全日制毕业院校
     */
    private String college;

    /**
     * 全日制专业
     */
    private String major;

    /**
     * 职级id
     */
    private Integer rankId;

    /**
     * 职级名称
     */
    private Integer rankName;

    /**
     * 在岗状态
     */
    private Integer workStatus;

    /**
     * 参加工作时间
     */
    private Date joinWorkTime;

    /**
     * 全日制学位
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
     * 用户类型
     */
    private Integer userType;

    /**
     * 最近登录时间
     */
    private Date lastLoginTime;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * 登录失败次数
     */
    private Integer loginFailedTimes;

    /**
     * 最近登录失败时间
     */
    private Date recentlyFailedTime;

    /**
     * 领导人姓名（管理员使用）
     */
    private String leaderName;

    /**
     * 真实姓名（管理员使用）
     */
    private String realName;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}
