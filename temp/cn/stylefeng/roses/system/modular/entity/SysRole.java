package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 系统角色表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    /**
     * 角色名称
     */
    @TableField("ROLE_NAME")
    private String roleName;

    /**
     * 角色描述
     */
    @TableField("ROLE_DESC")
    private String roleDesc;

    /**
     * 状态，0不可用，1正常，2已删除
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 创建人ID
     */
    @TableField("CREATE_BY_ID")
    private String createById;

    /**
     * 创建人名称
     */
    @TableField("CREATE_BY_USR")
    private String createByUsr;

    /**
     * 修改人ID
     */
    @TableField("UPD_BY_ID")
    private String updById;

    /**
     * 修改人名称
     */
    @TableField("UPD_BY_USR")
    private String updByUsr;

    /**
     * 删除人ID
     */
    @TableField("DEL_BY_ID")
    private String delById;

    /**
     * 删除人名称
     */
    @TableField("DEL_BY_USR")
    private String delByUsr;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCreateById() {
        return createById;
    }

    public void setCreateById(String createById) {
        this.createById = createById;
    }

    public String getCreateByUsr() {
        return createByUsr;
    }

    public void setCreateByUsr(String createByUsr) {
        this.createByUsr = createByUsr;
    }

    public String getUpdById() {
        return updById;
    }

    public void setUpdById(String updById) {
        this.updById = updById;
    }

    public String getUpdByUsr() {
        return updByUsr;
    }

    public void setUpdByUsr(String updByUsr) {
        this.updByUsr = updByUsr;
    }

    public String getDelById() {
        return delById;
    }

    public void setDelById(String delById) {
        this.delById = delById;
    }

    public String getDelByUsr() {
        return delByUsr;
    }

    public void setDelByUsr(String delByUsr) {
        this.delByUsr = delByUsr;
    }

    @Override
    public String toString() {
        return "SysRole{" +
        "id=" + id +
        ", roleName=" + roleName +
        ", roleDesc=" + roleDesc +
        ", status=" + status +
        ", createTime=" + createTime +
        ", createById=" + createById +
        ", createByUsr=" + createByUsr +
        ", updById=" + updById +
        ", updByUsr=" + updByUsr +
        ", delById=" + delById +
        ", delByUsr=" + delByUsr +
        "}";
    }
}
