package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 账号和角色关联表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
public class SysRefUsrRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

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


    public String getId() {
        return id;
    }

    public void setId(String id) {
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
