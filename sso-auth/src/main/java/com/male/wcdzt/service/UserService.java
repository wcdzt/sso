package com.male.wcdzt.service;

import com.male.wcdzt.model.pojo.User;
import com.male.wcdzt.model.req.ReqUser;

/**
 * 描述：UserService接口
 */
public interface UserService {
    Object getAllUsers();

    User getUserByUserName(String username);

    Object save(ReqUser reqUser);
}
