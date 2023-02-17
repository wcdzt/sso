package com.male.wcdzt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * SsoClientApp
 *
 * @author zxr
 * @author wcdzt
 * @version 1.0
 * @description
 * @date 2023-02-17
 */
@SpringBootApplication
/**
 * 开启单点登录
 */
@EnableOAuth2Sso
public class SsoClientMainApp {

    public static void main(String[] args) {
        SpringApplication.run(SsoClientMainApp.class, args);
    }

}
