package com.jkguo.test.resp;

/**
 * Created by jkguo on 2016/11/11.
 * 请求返回基础类
 */
public class BaseResp {
    private String code;//请求返回码
    private String message;//请求返回信息
    private Object data;//请求返回数据

    //设置请求处理结果
    public void setResult(RespResult result) {
        this.code = result.getCode();
        this.message = result.getMessage();
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    //请求返回状态枚举
    public enum RespResult {

        RESP_RESUlT_FAILED("0000","请求处理失败"),
        RESP_RESUlT_SUCCESS("0001","请求处理成功")
        ;

        private String code;//请求返回码
        private String message;//请求返回信息

        RespResult(String code, String message) {
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
}
