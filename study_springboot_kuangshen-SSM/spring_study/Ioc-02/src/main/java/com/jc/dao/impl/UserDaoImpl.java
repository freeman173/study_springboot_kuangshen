package com.jc.dao.impl;



import com.jc.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("默认获取用户数据！");
    }
}
