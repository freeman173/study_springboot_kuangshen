package com.jc.proxy_dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



//动态代理类
public class ProxyInvocationHandler implements InvocationHandler {

//    被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //    生成得到代理类
    public Object getProxy(){

        /*
        Proxy类就是用来创建一个代理对象的类。
        三个参数含义：
            loader: 用哪个类加载器去加载代理对象
            interfaces:动态代理类需要实现的接口
            h:动态代理方法在执行时，会调用h里面的invoke方法去执行
         */
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);

    }


//    代理执行真实角色的方法并返回结果
    /*

    当我们通过动态代理对象调用一个方法时候，这个方法的调用就会被转发到实现InvocationHandler接口类的invoke方法来调用

        三个参数含义：
            proxy：就是代理对象，newProxyInstance方法的返回对象
            method：调用的方法
            args: 方法中的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

//        反射技术获取方法名
        log(method.getName());
        Object result=method.invoke(target,args);
        return result;

    }



//    增加一些附属功能
    public void log(String msg){
        System.out.println("执行了"+msg+"方法！");
    }



}
