package com.lzw.order_admin_sys.controller;

import com.lzw.order_admin_sys.entity.DoctorInfo;
import com.lzw.order_admin_sys.entity.OrderInfoResult;
import com.lzw.order_admin_sys.mapper.DoctorInfoMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * 功能描述
 *
 * @Author LZW
 * @CreateTime 2021/01/31 21:51
 * @UpdateTime 2021/01/31 21:51
 * @Version 1.0.0
 */

@RestController
@RequestMapping("getDoctorInfo")
public class DoctorInfoController {
    @Resource
    DoctorInfoMapper doctorInfoMapper;

    @RequestMapping("queryMsg")
    public OrderInfoResult<List<DoctorInfo>> queryMsg() {
        return OrderInfoResult.bulidSuccesResult(doctorInfoMapper.getDoctorInfo());
    }


    @RequestMapping("getMsg")
    public List getMsg(){
        return (List) OrderInfoResult.bulidFailResult(doctorInfoMapper.getMsg());
    }

}
