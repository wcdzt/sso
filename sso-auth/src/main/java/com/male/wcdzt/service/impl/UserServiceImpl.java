package com.male.wcdzt.service.impl;

import com.male.wcdzt.model.dao.UserMapper;
import com.male.wcdzt.model.pojo.User;
import com.male.wcdzt.model.req.ReqUser;
import com.male.wcdzt.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Object getAllUsers() {
        List<User> users = userMapper.selectAllUsers();
        return users;
    }

    @Override
    public User getUserByUserName(String username) {
        return userMapper.selectUserByUsername(username);
    }

    @Override
    public Object save(ReqUser reqUser) {
        int count = userMapper.save(reqUser);
        return count;
    }


}
