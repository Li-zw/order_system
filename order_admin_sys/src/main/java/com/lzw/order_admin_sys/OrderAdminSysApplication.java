package com.lzw.order_admin_sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lzw.order_admin_sys.mapper")	//使用MapperScan批量扫描所有的Mapper接口
public class OrderAdminSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderAdminSysApplication.class, args);
	}

}
