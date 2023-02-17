package com.male.wcdzt.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author wcdzt
 * @version 1.0
 * @description
 * @date 2023-02-17
 */
@RestController
public class UserController {

    @RequestMapping("/getUser")
    public Object getUser(Authentication authentication) {
        return authentication;
    }
}
