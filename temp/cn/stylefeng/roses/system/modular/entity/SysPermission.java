package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    /**
     * 权限代码
     */
    @TableField("PERMISSION_CODE")
    private String permissionCode;

    /**
     * 权限名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 模块名称
     */
    @TableField("MODUEL_NAME")
    private String moduelName;

    /**
     * 模块代码
     */
    @TableField("MODUEL_CODE")
    private String moduelCode;

    /**
     * 权限类型
     */
    @TableField("PERMISSION_TYPE")
    private Integer permissionType;

    /**
     * 备注
     */
    @TableField("DESC")
    private String desc;

    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    private LocalDateTime createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModuelName() {
        return moduelName;
    }

    public void setModuelName(String moduelName) {
        this.moduelName = moduelName;
    }

    public String getModuelCode() {
        return moduelCode;
    }

    public void setModuelCode(String moduelCode) {
        this.moduelCode = moduelCode;
    }

    public Integer getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(Integer permissionType) {
        this.permissionType = permissionType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SysPermission{" +
        "id=" + id +
        ", permissionCode=" + permissionCode +
        ", name=" + name +
        ", moduelName=" + moduelName +
        ", moduelCode=" + moduelCode +
        ", permissionType=" + permissionType +
        ", desc=" + desc +
        ", createTime=" + createTime +
        "}";
    }
}
