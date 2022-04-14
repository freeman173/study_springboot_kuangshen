package com.example.springboot5_springboot_shiro.service;

import com.example.springboot5_springboot_shiro.mapper.UserMapper;
import com.example.springboot5_springboot_shiro.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User queryuserbyname(String name) {

        return userMapper.queryuserbyname(name);
    }
}
