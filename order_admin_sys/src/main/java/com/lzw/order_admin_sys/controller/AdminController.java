package com.lzw.order_admin_sys.controller;

import com.lzw.order_admin_sys.dao.UserUtils;
import com.lzw.order_admin_sys.entity.Admin;
import com.lzw.order_admin_sys.entity.Result;
import com.lzw.order_admin_sys.mapper.AdminMapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @Author LZW
 * @CreateTime 2020/12/29 12:51
 * @UpdateTime 2020/12/29 12:51
 * @Version 1.0.0
 */


@RestController
@RequestMapping("admin")
public class AdminController {
    @Resource
    private AdminMapper adminMapper;
    String fail_code = "0";     //错误标志
    String success_code = "1";  //成功标志
    String fail_status = "fail";    //失败状态码
    String success_status = "success";  //成功状态码
    Result result;


    //登录
    @RequestMapping("login")
    public Result login(String username, String password) {
        Admin admin = adminMapper.queryAdmin(username, password);
        if (username == null || "".equals(username)) {
            result = new Result(fail_code, fail_status, "用户名不能为空，请重新输入...");
        } else if (password == null || "".equals(password)) {
            result = new Result(fail_code, fail_status, "密码不能为空，请重新输入...");
        } else if (admin == null) {
            result = new Result(fail_code, fail_status, "用户名或密码错误，请检查后重新输入...");
        } else {
            result = new Result(success_code, success_status, "登录验证通过...");
        }
        return result;
    }

    //注册
    @RequestMapping("register")
    public Result register(@RequestBody Admin input_admin) {
        String ipt_user = input_admin.getUsername();
        String ipt_pwd = input_admin.getPassword();
        Admin rs_admin = adminMapper.queryAdminName(ipt_user);
        UserUtils userUtils = new UserUtils();
        if (input_admin.getUsername().equals("") || input_admin.getUsername() == null) {
            return new Result(fail_code, fail_status, "用户名不能为空...");
        }
        if (input_admin.getPassword().equals("") || input_admin.getPassword() == null) {
            return new Result(fail_code, fail_status, "密码不能为空...");
        }
        if (userUtils.isUserName(ipt_user).getCode().equals(fail_code)) {
            return new Result(fail_code, fail_status, userUtils.isUserName(ipt_user).getMessage());
        }
        if (userUtils.isPassWord(ipt_pwd).getCode().equals(fail_code)) {
            return new Result(fail_code, fail_status, userUtils.isPassWord(ipt_pwd).getMessage());
        }
        try {
            if (rs_admin == null) {
                boolean ending = adminMapper.insertAdmin(input_admin);
                if (ending == true) {
                    return new Result(success_code, success_status, "恭喜，用户注册成功...");
                }
            } else if (rs_admin.getUsername().equals(input_admin.getUsername())) {
                return new Result(fail_code, fail_status, "用户名已经存在，请重试...");
            } else {
                return new Result(fail_code, fail_status, "用户注册失败...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return new Result(fail_code, fail_status, "未知错误，请重试...");
    }
}
