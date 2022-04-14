package com.example.spring_boot_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/*

项目的入口处：
    SpringBootApplication是一个项目启动类，做了4件事:
        推断这个项目的类型是否为web项目。
        查找并加载所有可用的初始化器，设置到初始化属性中。
        找出所有的监听器并设置到listene属性中。
        推断并设置main方法的定义类，找到运行的主类。

 */

@SpringBootApplication
public class SpringBootDemo1Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootDemo1Application.class, args);
    }

}