package com.male.wcdzt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SsoAuthApp
 *
 * @author wcdzt
 * @version 1.0
 * @description
 * @date 2023-02-17
 */
@SpringBootApplication(scanBasePackages = "com.male.wcdzt")
@MapperScan(basePackages = "com.male.wcdzt.model.dao")
public class SsoAuthMainApp {
    public static void main(String[] args) {
        SpringApplication.run(SsoAuthMainApp.class, args);
    }
}
