package cn.stylefeng.roses.system.modular.service;

import cn.stylefeng.roses.system.modular.entity.SmsObject;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 短信发送对象（创建短信对象分类，一个分类可关联多个要发送的用户，当发送短信时可选择某一分类快捷的选择某分类发送短信到该分类下绑定的成员） 服务类
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
public interface SmsObjectService extends IService<SmsObject> {

}
