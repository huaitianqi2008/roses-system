package cn.stylefeng.roses.system.api.exception.enums;


import cn.stylefeng.roses.kernel.model.exception.AbstractBaseExceptionEnum;

/**
 * 字典类型异常枚举
 *
 * @author wangzhongqiang
 * @data 2018/4/19 9:22
 */
public enum SysOrgExceptionEnum implements AbstractBaseExceptionEnum {

    ORG_IS_EXIST(1210, "组织机构已存在！"),
    NEEDED_ATTR_NULL(1211, "必填属性不能为空"),
    WRONG_STATUS(1212, "状态错误！"),
    ORG_IS_NOT_EXIST(1213, "组织机构不存在！"),
    EXIST_USER(1214, "机构内存在人员，无法删除！");


    SysOrgExceptionEnum(int code, String message) {
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
