package com.lzw.order_admin_sys.entity;

/**
 * 功能描述
 *
 * @Author LZW
 * @CreateTime 2021/01/31 21:31
 * @UpdateTime 2021/01/31 21:31
 * @Version 1.0.0
 */

public class DoctorInfo {
    private String dno;
    private String dept;
    private String type;
    private String name;


    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}