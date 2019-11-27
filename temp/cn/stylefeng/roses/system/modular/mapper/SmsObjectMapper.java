package cn.stylefeng.roses.system.modular.mapper;

import cn.stylefeng.roses.system.modular.entity.SmsObject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 短信发送对象（创建短信对象分类，一个分类可关联多个要发送的用户，当发送短信时可选择某一分类快捷的选择某分类发送短信到该分类下绑定的成员） Mapper 接口
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
public interface SmsObjectMapper extends BaseMapper<SmsObject> {

}
