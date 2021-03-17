package com.lzw.order_admin_sys.controller;

import com.lzw.order_admin_sys.entity.OrderInfo;
import com.lzw.order_admin_sys.entity.OrderInfoResult;
import com.lzw.order_admin_sys.mapper.OrderInfoMapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述
 *
 * @Author LZW
 * @CreateTime 2021/01/30 18:05
 * @UpdateTime 2021/01/30 18:05
 * @Version 1.0.0
 */


@RestController
@RequestMapping("order")
public class OrderInfoController {
    @Resource
    private OrderInfoMapper orderInfoMapper;


    /**
     * 查询预约信息
     *
     * @return
     */
    @RequestMapping("queryInfoByUser")
    public OrderInfoResult<List<OrderInfo>> queryInfo(String user) {
        return OrderInfoResult.bulidSuccesResult(orderInfoMapper.queryOrderInfoByUser(user));
    }


    @RequestMapping("queryInfo")
    public OrderInfoResult<List<OrderInfo>> getInfo() {
        return OrderInfoResult.bulidSuccesResult(orderInfoMapper.queryOrderInfo());
    }


    /**
     * 向数据库写入预约信息
     *
     * @param ipt_orderInfo
     * @return
     */
    @RequestMapping("insertOrderInfo")
    public OrderInfoResult<Boolean> insertOrderInfo(@RequestBody OrderInfo ipt_orderInfo) {
        boolean isSuccess;
        String createID = OrderInfo.createId();
        ipt_orderInfo.setOid(createID);
        isSuccess = orderInfoMapper.insertSelective(ipt_orderInfo);
        if (isSuccess) {
            return OrderInfoResult.bulidSuccesResult(isSuccess);
        } else {
            return OrderInfoResult.bulidFailResult(isSuccess);
        }
    }


    @RequestMapping("queryMsg")
    public OrderInfoResult<List<OrderInfo>> queryMsg(String params){
        return OrderInfoResult.bulidSuccesResult(orderInfoMapper.queryOrderInfoByFactor(params));
    }


    /**
     * 取消预约功能
     *
     * @param oid
     * @return
     */
    @RequestMapping("cancel")
    public OrderInfoResult<Boolean> cancelOrder(String oid) {
        boolean isSuccess;
        isSuccess = orderInfoMapper.deleteOrderInfo(oid);
        if (isSuccess) {
            return OrderInfoResult.bulidSuccesResult(isSuccess);
        } else {
            return OrderInfoResult.bulidFailResult(isSuccess);
        }
    }

    /**
     * 更新预约信息
     *
     * @param ipt_orderInfo
     * @return
     */
    @RequestMapping("update")
    public OrderInfoResult<Boolean> updateOrder(@RequestBody OrderInfo ipt_orderInfo) {
        boolean isSuccess;
        isSuccess = orderInfoMapper.updateOrderInfo(ipt_orderInfo);
        if (isSuccess) {
            return OrderInfoResult.bulidSuccesResult(isSuccess);
        } else {
            return OrderInfoResult.bulidFailResult(isSuccess);
        }
    }


}
