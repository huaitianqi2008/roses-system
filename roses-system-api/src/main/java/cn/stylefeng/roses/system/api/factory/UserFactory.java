package cn.stylefeng.roses.system.api.factory;

import cn.stylefeng.roses.core.util.ToolUtil;
import cn.stylefeng.roses.system.api.entity.SysUser;

/**
 * 用户创建工厂
 *
 * @author Hyer
 * @date 2017-05-05 22:43
 */
public class UserFactory {

/*
    public static SysUser createUser(UserDto userDto) {
        if (userDto == null) {
            return null;
        } else {
            User user = new User();
            BeanUtils.copyProperties(userDto, user);
            return user;
        }
    }
*/

    public static SysUser editUser(SysUser newUser, SysUser oldUser) {
        if (newUser == null || oldUser == null) {
            return oldUser;
        } else {
            if (ToolUtil.isNotEmpty(newUser.getAvatar())) {
                oldUser.setAvatar(newUser.getAvatar());
            }else{
                oldUser.setAvatar("");
            }

            if (ToolUtil.isNotEmpty(newUser.getName())) {
                oldUser.setName(newUser.getName());
            }

            if (ToolUtil.isNotEmpty(newUser.getBirthday())) {
                oldUser.setBirthday(newUser.getBirthday());
            }

            if (ToolUtil.isNotEmpty(newUser.getOrgId())) {
                oldUser.setOrgId(newUser.getOrgId());
            }

            if (ToolUtil.isNotEmpty(newUser.getSex())) {
                oldUser.setSex(newUser.getSex());
            }

            if (ToolUtil.isNotEmpty(newUser.getEmail())) {
                oldUser.setEmail(newUser.getEmail());
            }else{
                oldUser.setEmail("");
            }

            if (ToolUtil.isNotEmpty(newUser.getPhone())) {
                oldUser.setPhone(newUser.getPhone());
            }

            if(ToolUtil.isNotEmpty(newUser.getRealName())){
                oldUser.setRealName(newUser.getRealName());
            }else{
                oldUser.setRealName("");
            }

            if(ToolUtil.isNotEmpty(newUser.getLeaderName())){
                oldUser.setLeaderName(newUser.getLeaderName());
            }

            return oldUser;
        }
    }
}
