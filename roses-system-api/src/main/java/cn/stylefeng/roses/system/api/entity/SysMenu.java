package cn.stylefeng.roses.system.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 系统菜单表
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
@TableName("sys_menu")
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID",type= IdType.ID_WORKER)
    private String id;

    /**
     * 菜单名称
     */
    @TableField("MENU_NAME")
    private String menuName;

    /**
     * 菜单类型：1目录 、2地址
     */
    @TableField("MENU_TYPE")
    private Integer menuType;

    /**
     * 菜单图标
     */
    @TableField("MENU_ICON")
    private String menuIcon;

    /**
     * 菜单地址
     */
    @TableField("MENU_LINK")
    private String menuLink;

    /**
     * 打开位置
     */
    @TableField("MENU_TARGET")
    private String menuTarget;

    /**
     * 菜单权限
     */
    @TableField("MENU_PERMISSION")
    private String menuPermission;

    /**
     * 上级菜单ID
     */
    @TableField("PARENT_ID")
    private String parentId;

    /**
     * 菜单层级
     */
    @TableField("MENU_LEVEL")
    private Integer menuLevel;

    /**
     * 菜单排序
     */
    @TableField("ORDER_NUM")
    private Integer orderNum;

    /**
     * 备注
     */
    @TableField("DESC")
    private String desc;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuLink() {
        return menuLink;
    }

    public void setMenuLink(String menuLink) {
        this.menuLink = menuLink;
    }

    public String getMenuTarget() {
        return menuTarget;
    }

    public void setMenuTarget(String menuTarget) {
        this.menuTarget = menuTarget;
    }

    public String getMenuPermission() {
        return menuPermission;
    }

    public void setMenuPermission(String menuPermission) {
        this.menuPermission = menuPermission;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "SysMenu{" +
        "id=" + id +
        ", menuName=" + menuName +
        ", menuType=" + menuType +
        ", menuIcon=" + menuIcon +
        ", menuLink=" + menuLink +
        ", menuTarget=" + menuTarget +
        ", menuPermission=" + menuPermission +
        ", parentId=" + parentId +
        ", menuLevel=" + menuLevel +
        ", orderNum=" + orderNum +
        ", desc=" + desc +
        "}";
    }
}
