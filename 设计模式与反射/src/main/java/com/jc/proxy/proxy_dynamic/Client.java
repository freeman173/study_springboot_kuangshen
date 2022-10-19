package com.jc.proxy.proxy_dynamic;


import com.jc.proxy.proxy_static.demo2.UserService;
import com.jc.proxy.proxy_static.demo2.UserServiceImpl;

//客户端
public class Client {



    public static void main(String[] jc){

//        真实角色
        UserServiceImpl userServiceimpl=new UserServiceImpl();
//        动态代理真实角色
        ProxyInvocationHandler pih=new ProxyInvocationHandler(userServiceimpl);

//        动态生成代理类
        UserService userService= (UserService) pih.getProxy();

//通过执行真实角色的方法
        userService.add("蒋超");

        System.out.println("_________________________________");

    }


}
