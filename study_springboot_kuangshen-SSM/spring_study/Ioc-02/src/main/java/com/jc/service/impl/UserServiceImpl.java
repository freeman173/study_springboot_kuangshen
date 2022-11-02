package com.jc.service.impl;

import com.jc.dao.UserDao;
import com.jc.service.UserService;

public class UserServiceImpl implements UserService {

//    将dao层对象注入进来,直接写死有局限性
//    private UserDao userDao=new UserDaoImpl();


//    来个ioc的原型，使用set方法动态地注入dao层对象
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void getUser() {

        this.userDao.getUser();

    }
}
