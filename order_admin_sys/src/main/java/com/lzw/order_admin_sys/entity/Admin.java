package com.lzw.order_admin_sys.entity;

/**
 * 功能描述 管理员实体类
 *
 * @Author LZW
 * @CreateTime 2020/12/29 12:39
 * @UpdateTime 2020/12/29 12:39
 * @Version 1.0.0
 */

public class Admin {
    private int aid;
    private String username;
    private String password;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
