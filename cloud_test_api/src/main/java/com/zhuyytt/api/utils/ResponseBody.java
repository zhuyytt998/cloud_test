package com.zhuyytt.api.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * 请求返回内容
 *
 * @author zhuyytt
 * @date 2021/1026
 * @param <T>
 */
@Getter
@Setter
public class ResponseBody<T> {

    private String code;
    private T data;
    private String msg;

    public static final String OK = "success";
    public static final String OK_CODE = "0";
    public static final String FAIL = "error";
    public static final String FAIL_CODE = "1";

    public ResponseBody(String code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static ResponseBody ok() {
        return new ResponseBody(OK_CODE, null, OK);
    }

    public static <T> ResponseBody ok(T data) {
        return new ResponseBody(OK_CODE, data, OK);
    }

    public ResponseBody ok(T data, String msg) {
        return new ResponseBody(OK_CODE, data, msg);
    }

    public static ResponseBody fail() {
        return new ResponseBody(FAIL_CODE, null, FAIL);
    }

    public ResponseBody fail(T data) {
        return new ResponseBody(FAIL_CODE, data, FAIL);
    }

    public ResponseBody fail(T data, String msg) {
        return new ResponseBody(FAIL_CODE, data, msg);
    }

}
