package com.jc.proxy_dynamic;


import com.jc.proxy_static.demo1.Host;
import com.jc.proxy_static.demo1.Host2;
import com.jc.proxy_static.demo1.Rent;
import com.jc.proxy_static.demo2.UserService;
import com.jc.proxy_static.demo2.UserServiceImpl;

//客户端
public class Client {



    public static void main(String[] jc){

//        真实角色
        UserServiceImpl userServiceimpl=new UserServiceImpl();
//        动态代理真实角色
        ProxyInvocationHandler pih=new ProxyInvocationHandler();
        pih.setTarget(userServiceimpl);

//        动态生成代理类
        UserService userService= (UserService) pih.getProxy();

//通过执行真实角色的方法
        userService.add("蒋超");



        Host host=new Host();
        pih.setTarget(host);
        Rent rent= (Rent) pih.getProxy();
        rent.rent();


        Host2 host2=new Host2();
        pih.setTarget(host2);
        rent= (Rent) pih.getProxy();
        rent.rent();


        System.out.println("_________________________________");

    }


}
