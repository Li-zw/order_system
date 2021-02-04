package com.lzw.order_admin_sys.mapper;

import com.lzw.order_admin_sys.entity.OrderInfo;

import java.util.List;

public interface OrderInfoMapper {
    List<OrderInfo> queryOrderInfo();
    boolean insertSelective(OrderInfo orderInfo);
    boolean deleteOrderInfo(OrderInfo orderInfo );
    boolean updateOrderInfo(OrderInfo orderInfo );

}
