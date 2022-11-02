package com.jc.dao.impl;

import com.jc.dao.UserDao;

public class UserMysqlImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("mysql获取用户数据！");
    }
}
