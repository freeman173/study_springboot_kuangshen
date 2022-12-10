package com.example.demo1;

import com.example.demo1.pojo.Person;
import com.example.demo1.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    Person person;

    @Resource
    private HelloService helloService;

    @Test
    void contextLoads() {

//        person.getAge();

        helloService.getAge();
        System.out.println("_______________");

    }

}
