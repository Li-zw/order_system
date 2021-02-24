package com.lzw.order_admin_sys.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 功能描述
 *
 * @Author LZW
 * @CreateTime 2021/01/30 17:33
 * @UpdateTime 2021/01/30 17:33
 * @Version 1.0.0
 */

public class OrderInfo {
    private String oid;
    private String user;
    private String name;
    private String sex;
    private int age;
    private String dept;
    private String type;
    private String order_time;
    private String detail;

    public OrderInfo() {

    }

    public OrderInfo(String user,String name, String sex, int age, String dept,String type, String order_time, String detail) {
        this.user = user;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.dept = dept;
        this.type = type;
        this.order_time = order_time;
        this.detail = detail;
    }




    public static String createId() {
        String rs_id;
        String result = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        String date = simpleDateFormat.format(new Date());
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            result += random.nextInt(10);
        }
        rs_id = date + result;
        return rs_id;
    }


    @Override
    public String toString() {
        return "OrderInfo{" +
                "oid='" + oid + '\'' +
                ", user='" + user + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                ", type='" + type + '\'' +
                ", order_time='" + order_time + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


}
