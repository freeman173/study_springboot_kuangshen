package com.jc.config;


import com.jc.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//用配置类来代替配置文件。“@Configuration”本质上也是一个组件
@Configuration
//指定扫描的包
@ComponentScan("com.jc")
public class JcConfig {

/*
    相当于在ioc中注入了一个bean；
    可通过“getBean("getUser")”拿到该类实例：方法名"getUser"就可以类比于beanid

 */
    @Bean
    public User getUser(){

        return new User();//将需要取出的对象给返回
    }



}
