package com.lzw.order_admin_sys.mapper;

import com.lzw.order_admin_sys.entity.OrderInfo;

import java.util.List;

public interface OrderInfoMapper {
    List<OrderInfo> queryOrderInfoByUser(String user);
    boolean insertSelective(OrderInfo orderInfo);
    boolean deleteOrderInfo(String oid);
    boolean updateOrderInfo(OrderInfo orderInfo );
    List<OrderInfo> queryOrderInfo();
    List<OrderInfo> queryOrderInfoByFactor(String params);


//    select * from order_info where TO_DAYS(order_time) - TO_DAYS(NOW()) >= 0;
}
