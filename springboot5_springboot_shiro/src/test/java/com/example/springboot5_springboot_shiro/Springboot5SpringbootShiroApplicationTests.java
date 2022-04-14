package com.example.springboot5_springboot_shiro;

import com.example.springboot5_springboot_shiro.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot5SpringbootShiroApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {

        System.out.println(userService.queryuserbyname("root1"));
    }

}
