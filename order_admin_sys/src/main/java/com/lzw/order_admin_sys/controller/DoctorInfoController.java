package com.lzw.order_admin_sys.controller;

import com.lzw.order_admin_sys.entity.DoctorInfo;
import com.lzw.order_admin_sys.entity.OrderInfoResult;
import com.lzw.order_admin_sys.mapper.DoctorInfoMapper;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.print.Doc;
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

    /**
     * 获取医生全部信息
     * @return
     */
    @RequestMapping("queryMsg")
    public OrderInfoResult<List<DoctorInfo>> queryMsg() {
        return OrderInfoResult.bulidSuccesResult(doctorInfoMapper.getDoctorInfo());
    }

    /**
     * 获取部门编号
     * @return
     */
    @RequestMapping("getDno")
    public OrderInfoResult<List<DoctorInfo>> getMsg() {
        return OrderInfoResult.bulidSuccesResult(doctorInfoMapper.getDno());
    }

    /**
     * 获取部门信息
     * @return
     */
    @RequestMapping("getDept")
    public OrderInfoResult<List<DoctorInfo>> getDept() {
        return OrderInfoResult.bulidSuccesResult(doctorInfoMapper.getDept());
    }

    /**
     * 根据部门获取部门医生信息
     * @param dept
     * @return
     */
    @RequestMapping("getDoctorInfoByDept")
    public OrderInfoResult<List<DoctorInfo>> queryDoct(String dept) {
        return OrderInfoResult.bulidSuccesResult(doctorInfoMapper.getDoctorInfoByDept(dept));
    }

    /**
     * 根据部门号获取部门信息
     * @param dno
     * @return
     */
    @RequestMapping("queryDeptByDno")
    public OrderInfoResult<List<DoctorInfo>> queryDeptByDno(String dno) {
        return OrderInfoResult.bulidSuccesResult(doctorInfoMapper.queryDeptByDno(dno));
    }

    /**
     * 获取医生职务
     * @return
     */
    @RequestMapping("getType")
    public OrderInfoResult<List<DoctorInfo>> getType() {
        return OrderInfoResult.bulidSuccesResult(doctorInfoMapper.getType());
    }

    /**
     * 写入医生信息
     * @param doctorInfo
     * @return
     */
    @RequestMapping("insert")
    public OrderInfoResult insert(@RequestBody DoctorInfo doctorInfo) {
        String did;
        did = "2021" +doctorInfo.getDno()+DoctorInfo.createDid();
        doctorInfo.setDid(did);
        String name = doctorInfo.getDname() + "(" + doctorInfo.getType() + ")";
        doctorInfo.setName(name);
        boolean isSuccess = doctorInfoMapper.insertDoctInfo(doctorInfo);
        if (isSuccess) {
            return OrderInfoResult.bulidSuccesResult("录入信息成功...");
        }
        return OrderInfoResult.bulidFailResult("录入信息失败，请重试...");
    }

    @RequestMapping("update")
    public OrderInfoResult updateByDid(@RequestBody DoctorInfo doctorInfo){
        String name = doctorInfo.getDname() + "(" + doctorInfo.getType() + ")";
        doctorInfo.setName(name);
        boolean isSuccess = doctorInfoMapper.updateByDid(doctorInfo);
        if(isSuccess){
            return OrderInfoResult.bulidSuccesResult("信息修改成功...");
        }else {
            return OrderInfoResult.bulidFailResult("更新失败,请重试...");
        }
    }

    /**
     * 删除医生信息
     * @param did
     * @return
     */
    @RequestMapping("delete")
    public OrderInfoResult deleteByDid(String did){
        boolean isSuccess = doctorInfoMapper.deleteByDid(did);
        if(isSuccess){
            return OrderInfoResult.bulidSuccesResult("删除信息成功...");
        }else{
            return OrderInfoResult.bulidFailResult("删除失败，请重试...");
        }
    }

}
