package com.lzw.order_admin_sys.dao;

import com.lzw.order_admin_sys.entity.Result;

/**
 * 功能描述
 *
 * @Author LZW
 * @CreateTime 2021/01/01 20:34
 * @UpdateTime 2021/01/01 20:34
 * @Version 1.0.0
 */

public class UserUtils {
    String fail_code = "0";     //错误标志
    String success_code = "1";  //成功标志
    String fail_status = "fail";    //失败状态码
    String success_status = "success";  //成功状态码
    Result result;

    /**
     * 判断用户名是否合法
     *
     * @param username
     * @return
     */
    public Result isUserName(String username) {
        int len = username.length();
        if (username == null || username.equals("")) {
            return new Result(fail_code, fail_status, "用户名为空...");
        } else if (len < 2 || len > 20) {
            return new Result(fail_code, fail_status, "用户名长度非法,用户名长度为2-20个字符...");
        } else {
            return new Result(success_code, success_status, "用户名合法...");
        }
    }


    /**
     * 判断密码是否合法
     *
     * @param password
     * @return
     */
    public Result isPassWord(String password) {
        int len = password.length();
        if (password == null || password.equals("")) {
            return new Result(fail_code, fail_status, "密码为空...");
        } else if (len < 8 || len > 20) {
            return new Result(fail_code, fail_status, "密码长度非法，密码长度为6-20字符...");
        } else {
            return new Result(success_code, success_status, "密码合法...");
        }
    }


}
