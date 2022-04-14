package com.example.spring_boot_task_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync//开启异步功能
@EnableScheduling//开启定时功能
@SpringBootApplication
public class SpringBootTaskDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTaskDemoApplication.class, args);
    }

}
