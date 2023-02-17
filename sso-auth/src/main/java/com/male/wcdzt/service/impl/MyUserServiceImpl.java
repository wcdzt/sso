package com.male.wcdzt.service.impl;

import com.male.wcdzt.model.pojo.SecurityUser;
import com.male.wcdzt.model.pojo.User;
import com.male.wcdzt.service.MyUserService;
import com.male.wcdzt.service.UserService;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MyUserServiceImpl implements UserDetailsService, MyUserService {

    @Resource
    private PasswordEncoder passwordEncoder;
    @Resource
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getUserByUserName(username);
        String name = user.getName();
        String password = user.getPassword();
        String authority = user.getAccount();
        return new SecurityUser(name, password, AuthorityUtils.commaSeparatedStringToAuthorityList(authority));
    }
}
