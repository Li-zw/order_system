package com.lzw.order_admin_sys.entity;

/**
 * 功能描述
 *
 * @Author LZW
 * @CreateTime 2021/01/30 19:28
 * @UpdateTime 2021/01/30 19:28
 * @Version 1.0.0
 */

public class OrderInfoResult<T> {
    private String code;
    private String status;
    private T data;
    public static final String SUCCESS_CODE = "1";   //成功标志
    public static final String FAIL_CODE = "0";     //失败标志
    public static final String fail_status = "fail";    //失败状态码
    public static final String success_status = "success";  //成功状态码

    public static <T>  OrderInfoResult<T> bulidSuccesResult(T data) {
        OrderInfoResult<T> orderInfoResult = new OrderInfoResult<T>();
        orderInfoResult.code = SUCCESS_CODE;
        orderInfoResult.status = success_status;
        orderInfoResult.data = data;
        return orderInfoResult;
    }
    public static <T>  OrderInfoResult<T> bulidFailResult(T data) {
        OrderInfoResult<T> orderInfoResult = new OrderInfoResult<T>();
        orderInfoResult.code = FAIL_CODE;
        orderInfoResult.status = fail_status;
        orderInfoResult.data = data;
        return orderInfoResult;
    }



    @Override
    public String toString() {
        return "OrderInfoResult{" +
                "code='" + code + '\'' +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static String getSuccessCode() {
        return SUCCESS_CODE;
    }

    public static String getFailCode() {
        return FAIL_CODE;
    }

    public static String getFail_status() {
        return fail_status;
    }

    public static String getSuccess_status() {
        return success_status;
    }
}
