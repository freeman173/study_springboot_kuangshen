package com.example.demo4.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/*
扩展mvc。

在config下自定义配置文件并交给springboot，springboot就会帮我们自动装配

 */

//@Configuration
//public class MyMvcConfig implements WebMvcConfigurer {
//
///*
//增加一个视图映射路径
// */
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//
//        registry.addViewController("/").setViewName("index");
//        registry.addViewController("/index").setViewName("index");
//
//    }
//
//
//}
