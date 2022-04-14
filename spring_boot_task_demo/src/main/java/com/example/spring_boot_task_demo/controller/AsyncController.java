package com.example.spring_boot_task_demo.controller;

import com.example.spring_boot_task_demo.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;



    @GetMapping("/hello")
    public String hello(){

        asyncService.hello();
        return "OK";
    }


}
