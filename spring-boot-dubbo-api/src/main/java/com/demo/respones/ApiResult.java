package com.demo.respones;

import com.demo.constant.ResponseCode;

import java.io.Serializable;

/**
 * Response data wrapper
 * @author hanxuan
 * @date 2021/2/3 15:45
 */

public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Response result code
     */
    private int code;

    /**
     * Return information
     */
    private String msg;

    /**
     * Return response data
     */
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ApiResult<T> success() {
        return buildResult(null, ResponseCode.SUCCESS, null);
    }

    public static <T> ApiResult<T> success(T data) {
        return buildResult(data, ResponseCode.SUCCESS, null);
    }

    public static <T> ApiResult<T> success(T data, String msg) {
        return buildResult(data, ResponseCode.SUCCESS, msg);
    }

    public static <T> ApiResult<T> failed() {
        return buildResult(null, ResponseCode.FAIL, null);
    }

    public static <T> ApiResult<T> failed(String msg) {
        return buildResult(null, ResponseCode.FAIL, msg);
    }

    public static <T> ApiResult<T> failed(T data) {
        return buildResult(data, ResponseCode.FAIL, null);
    }

    public static <T> ApiResult<T> failed(T data, String msg) {
        return buildResult(data, ResponseCode.FAIL, msg);
    }

    private static <T> ApiResult<T> buildResult(T data, int code, String msg) {
        ApiResult<T> apiResult = new ApiResult<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }
}
