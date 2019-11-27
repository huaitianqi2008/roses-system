package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
public class ViewUserPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("USERNAME")
    private Long username;

    /**
     * 权限代码
     */
    @TableField("ROLE")
    private String role;


    public Long getUsername() {
        return username;
    }

    public void setUsername(Long username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "ViewUserPermission{" +
        "username=" + username +
        ", role=" + role +
        "}";
    }
}
