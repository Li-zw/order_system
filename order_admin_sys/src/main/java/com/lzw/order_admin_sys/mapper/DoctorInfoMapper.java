package com.lzw.order_admin_sys.mapper;

import com.lzw.order_admin_sys.entity.DoctorInfo;

import java.util.List;

public interface DoctorInfoMapper {
    List<DoctorInfo> getDoctorInfo();
    List getMsg();
    List<DoctorInfo> getDoctorInfoByDept(String dept);
}
