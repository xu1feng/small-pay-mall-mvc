package edu.xyf.domain.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShopCartReq {

    // 哪个用户下单
    private String userId;

    // 下单哪个商品
    private String productId;

}
