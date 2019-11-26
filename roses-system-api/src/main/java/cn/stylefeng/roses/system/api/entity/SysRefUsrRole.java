package cn.stylefeng.roses.system.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 账号和角色关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("sys_ref_usr_role")
public class SysRefUsrRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID",type = IdType.ID_WORKER)
    private Long id;

    /**
     * 账号ID
     */
    @TableField("USR_ID")
    private String usrId;

    /**
     * 角色ID
     */
    @TableField("ROLE_ID")
    private String roleId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "SysRefUsrRole{" +
        "id=" + id +
        ", usrId=" + usrId +
        ", roleId=" + roleId +
        "}";
    }
}
