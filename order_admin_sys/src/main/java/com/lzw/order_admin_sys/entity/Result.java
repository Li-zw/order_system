package com.lzw.order_admin_sys.entity;

/**
 * 功能描述 结果集实体类
 *
 * @Author LZW
 * @CreateTime 2020/12/29 12:40
 * @UpdateTime 2020/12/29 12:40
 * @Version 1.0.0
 */

public class Result<T> {

    private static final String SUCCESS_CODE = "1";     //请求成功的标志
    private static final String FAIL_CODE = "0";     //请求失败的标志
    private String code;
    private String status;
    private T data;
    private String message;     //返回信息

    //无参构造方法
    public Result() {

    }

    //带参数的构造方法
    public Result(String code, String status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public Result(String code, String status, T data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }


    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public static String getSuccessCode() {
        return SUCCESS_CODE;
    }

    public static String getFailCode() {
        return FAIL_CODE;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
