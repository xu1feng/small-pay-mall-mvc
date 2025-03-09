package edu.xyf.domain.res;

import lombok.Data;

/**
 * @author Xuyifeng
 * @description
 * @date 2025/3/9 19:26
 */
@Data
public class WeixinQrCodeRes {

    private String ticket;
    private Long expire_seconds;
    private String url;

}
