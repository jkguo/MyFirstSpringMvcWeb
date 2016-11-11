package com.jkguo.test.enums;

/**
 * Created by jkguo on 2016/11/11.
 */
public enum RespResultEnum {

    RESP_RESUlT_FAILED("0000","请求处理失败"),
    RESP_RESUlT_SUCCESS("0001","请求处理成功")
    ;

    private String code;//请求返回码
    private String message;//请求返回信息

    RespResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
