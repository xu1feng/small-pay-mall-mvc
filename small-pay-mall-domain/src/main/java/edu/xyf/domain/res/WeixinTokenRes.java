package edu.xyf.domain.res;

import lombok.Data;

/**
 * @author Xuyifeng
 * @description 获取 AccessToken DTO对象
 * @date 2025/3/9 19:18
 */
@Data
public class WeixinTokenRes {

    private String access_token;
    private int expires_in;
    private String errcode;
    private String errmsg;

}
