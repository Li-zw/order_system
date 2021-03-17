package com.lzw.order_admin_sys.mapper;

import com.lzw.order_admin_sys.entity.DoctorInfo;

import javax.print.Doc;
import java.util.List;

public interface DoctorInfoMapper {
    List<DoctorInfo> getDoctorInfo();
    List getDno();
    List<DoctorInfo> getDoctorInfoByDept(String dept);
    List<DoctorInfo> queryDeptByDno(String dno);
    List<DoctorInfo> getDept();
    List<DoctorInfo> getType();
    boolean insertDoctInfo(DoctorInfo doctorInfo);
    boolean updateByDid(DoctorInfo doctorInfo);
    boolean deleteByDid(String did);

}
