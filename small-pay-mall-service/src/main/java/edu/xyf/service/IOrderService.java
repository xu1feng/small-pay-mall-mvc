package edu.xyf.service;

import edu.xyf.domain.req.ShopCartReq;
import edu.xyf.domain.res.PayOrderRes;

/**
 * @author Xuyifeng
 * @description 订单服务接口
 * @date 2025/3/10 19:30
 */

public interface IOrderService {

    PayOrderRes createOrder(ShopCartReq shopCartReq) throws Exception;

}
