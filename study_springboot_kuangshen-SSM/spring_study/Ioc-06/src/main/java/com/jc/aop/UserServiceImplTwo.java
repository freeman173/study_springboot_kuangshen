package com.jc.aop;

public class UserServiceImplTwo implements UserServiceTwo{


    @Override
    public void one() {
        System.out.println("这是第一个方法！");
    }

    @Override
    public void two() {
        System.out.println("这是第二个方法！");
    }
}
