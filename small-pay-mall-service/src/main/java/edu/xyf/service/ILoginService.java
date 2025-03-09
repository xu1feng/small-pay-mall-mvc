package edu.xyf.service;

import java.io.IOException;

/**
 * @author Xuyifeng
 * @description 微信服务
 * @date 2025/3/9 19:42
 */

public interface ILoginService {

    String createQrCodeTicket() throws Exception;

    String checkLogin(String ticket);

    void saveLoginState(String ticket, String openid) throws IOException;

}
