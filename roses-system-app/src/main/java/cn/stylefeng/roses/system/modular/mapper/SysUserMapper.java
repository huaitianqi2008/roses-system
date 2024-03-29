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
package cn.stylefeng.roses.system.modular.mapper;

import cn.stylefeng.roses.system.api.entity.SysUser;
import cn.stylefeng.roses.system.api.model.SysUserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2018-08-26
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUserInfo> getSysUserList(Page<SysUserInfo> page, SysUserInfo sysUserInfo);
}
