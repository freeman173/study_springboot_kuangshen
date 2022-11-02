package com.jc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {


/*
1、
 传统的：http://……/add?a=1&b=2
 restful的：http://……/add/a/b

2、下面；两个注解一般配合使用
@RequestMapping：定义映射路径
@PathVariable：获取映射路径中的参数；@pathVariable括号里的名字必须与占位符的名字一致


 */



//对uri做个一个类似格式的拼接
    @GetMapping("/add/{a}/{b}")
//    框架会自动将参数接受进来并做一个类型转换。
    public String test1(@PathVariable("a") int a, @PathVariable("b") int b, Model model){
        int res=a+b;
        model.addAttribute("msg","结果："+res);
        return "hello";
    }


//    通过表单提交
    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","结果："+res);
        return "hello";

    }







}


