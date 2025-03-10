package edu.xyf.domain.res;

import edu.xyf.common.constants.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayOrderRes {

    // 哪个用户下单的
    private String userId;

    // 下单的Id
    private String orderId;

    // 支付链接
    private String payUrl;

    // 订单状态枚举
    private Constants.OrderStatusEnum orderStatusEnum;

}
