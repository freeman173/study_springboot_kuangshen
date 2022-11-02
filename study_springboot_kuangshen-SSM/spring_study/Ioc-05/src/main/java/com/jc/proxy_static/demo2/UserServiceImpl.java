package com.jc.proxy_static.demo2;


//具体业务类
public class UserServiceImpl implements UserService{


    @Override
    public void add(String name) {
        System.out.println(name+"执行了新增操作！");
    }

    @Override
    public void delete() {
        System.out.println("删除操作！");
    }

    @Override
    public void update() {
        System.out.println("更新操作！");
    }

    @Override
    public void query() {
        System.out.println("查询操作！");
    }
}
