package com.jc.proxy_static.demo2;


//客户端
public class Client {

    public static void main(String[] args){

//真实业务角色
        UserServiceImpl userServiceimpl=new UserServiceImpl();


//        代理角色将真实业务角色代理并实现一些额外的功能
        UserServiceImplProxy userServiceImplProxy=new UserServiceImplProxy(userServiceimpl);
        userServiceImplProxy.add("dd");




    }

}
