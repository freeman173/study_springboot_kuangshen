package com.example.demo4.controller;


import com.example.demo4.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyController {

    @Autowired
    AsyncService asyncService;



    @RequestMapping("/asyncTest")
    public String testOne(){

        asyncService.hello();

        return "OK";
    }




}
