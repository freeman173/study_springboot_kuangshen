package com.jc.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jc.pojo.User;
import com.jc.utils.JsonUtils;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//在此注解的controller中，return “……”不会走视图解析器，会直接返回一个字符串
//@restcontroller=@controller+@responsebody
@RestController
//@Controller
public class UserController {


    @RequestMapping("/j1")
//    @ResponseBody
    public String json1() throws JsonProcessingException {



        User user=new User("蒋超",24,"男");

        String string = JsonUtils.getJson(user);

        return string;

    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {

        List<User> userList=new ArrayList<User>();

        User user1=new User("蒋超",24,"男");
        User user2=new User("蒋超",24,"男");


        userList.add(user1);userList.add(user2);


        String string = JsonUtils.getJson(userList);

        return string;

    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {

        Date date=new Date();



        String string = JsonUtils.getJson(date);

        return string;

    }





    }


