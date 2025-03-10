package edu.xyf.test.service;

import com.alibaba.fastjson2.JSON;
import edu.xyf.domain.req.ShopCartReq;
import edu.xyf.domain.res.PayOrderRes;
import edu.xyf.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderServiceTest {

    @Resource
    private IOrderService orderService;

    @Test
    public void test_createOrder() throws Exception {
        ShopCartReq shopCartReq = new ShopCartReq();
        shopCartReq.setUserId("xuyifeng");
        shopCartReq.setProductId("10001");
        PayOrderRes payOrderRes = orderService.createOrder(shopCartReq);
        log.info("请求参数: {}", JSON.toJSONString(shopCartReq));
        log.info("测试结果: {}", JSON.toJSONString(payOrderRes));
    }

}
