package edu.xyf.service;

import edu.xyf.domain.req.ShopCartReq;
import edu.xyf.domain.res.PayOrderRes;

import java.util.List;

/**
 * @author Xuyifeng
 * @description 订单服务接口
 * @date 2025/3/10 19:30
 */

public interface IOrderService {

    PayOrderRes createOrder(ShopCartReq shopCartReq) throws Exception;

    void changeOrderPaySuccess(String orderId);

    List<String> queryNoPayNotifyOrder();

    List<String> queryTimeoutCloseOrderList();

    boolean changeOrderClose(String orderId);

}
