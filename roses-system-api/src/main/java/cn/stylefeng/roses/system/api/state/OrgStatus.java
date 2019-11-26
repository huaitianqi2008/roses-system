package cn.stylefeng.roses.system.api.state;

/**
 * 是或否的枚举
 * @author liz
 * @date 2019年2月21日15:50:11
 */
public enum OrgStatus {

    DELETE(1, "删除"),
    NORMAL(0, "正常");


    int code;
    String message;

    OrgStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String valueOf(Integer status) {
        if (status == null) {
            return "";
        } else {
            for (OrgStatus s : OrgStatus.values()) {
                if (s.getCode() == status) {
                    return s.getMessage();
                }
            }
            return "";
        }
    }
}
