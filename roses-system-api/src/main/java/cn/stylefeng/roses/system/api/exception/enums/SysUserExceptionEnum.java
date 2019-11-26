package cn.stylefeng.roses.system.api.exception.enums;


import cn.stylefeng.roses.kernel.model.exception.AbstractBaseExceptionEnum;

/**
 * 字典类型异常枚举
 *
 * @author wangzhongqiang
 * @data 2018/4/19 9:22
 */
public enum SysUserExceptionEnum implements AbstractBaseExceptionEnum {

    ACCOUNT_IS_EXIST(1110, "帐号已存在！"),
    NOT_EXISTED(1111, "密码格式不正确(密码必须包含英文大、小写和数字三种)！"),
    NEEDED_ATTR_NULL(1112, "用户必填属性不能为空"),
    WRONG_STATUS(1113, "状态错误！");


    SysUserExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;

    private String message;

    @Override
    public Integer getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
