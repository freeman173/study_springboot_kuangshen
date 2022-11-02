package com.jc.dao.impl;

import com.jc.dao.UserDao;

public class UserJcImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("jc获取用户数据！");
    }
}
