package com.example.spring_boot_swagger_demo.controller;


import com.example.spring_boot_swagger_demo.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api("hello控制类")//swagger中会生成接口类说明
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

        return "hello";
    }

    //只要接口中返回了实体类，实体类就会被扫到swagger中生成配置文档
    @PostMapping(value = "/user")
    public User user(){
        return new User();
    }

    @ApiOperation("hello+姓名")//swagger中会生成接口操作说明
    @GetMapping("/hello2")
    public String hello2(String name){
        return "hello,"+name;
    }

    @ApiOperation("测试类")
    @PostMapping("/post_t")
    public User postt(@ApiParam("用户名") User user){

        return user;
    }





}
