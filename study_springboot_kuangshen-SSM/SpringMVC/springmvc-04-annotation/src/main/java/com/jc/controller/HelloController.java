package com.jc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//加上该注解后，会被spring扫描进入ioc中被管理
@Controller
//用于映射url请求路径到控制器的一个注解；可作用域类或者方法上。
@RequestMapping("/one")
public class HelloController {

//    映射路径为：“/hello”
    @RequestMapping("/hello")
//    Model对象专门用于封装数据（ModelandVilew用于封装数据与页面跳转）
    public String hello(Model model){
//        封装数据
        model.addAttribute("msg","使用了注解开发springmvc！");

//        返回给视图解析器：跳转到hello.jsp页面
        return "hello";


    }

    @RequestMapping("/hello2")
    public String hello2(Model model){
//        封装数据
        model.addAttribute("msg","使用了注解开发springmvc！!");

//        返回给视图解析器：跳转到hello.jsp页面（）
        return "hello";


    }



}
