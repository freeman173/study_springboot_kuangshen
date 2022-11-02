package com.jc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {



    @GetMapping("/hello")
//    Model对象专门用于封装数据（ModelandVilew用于封装数据与页面跳转）
    public String hello(Model model){


        System.out.println("超人执行了HelloController");

        //返回一个字符串
        return "hello";


    }


}
