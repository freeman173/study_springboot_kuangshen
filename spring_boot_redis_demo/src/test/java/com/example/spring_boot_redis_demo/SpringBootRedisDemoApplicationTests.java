package com.example.spring_boot_redis_demo;

import com.example.spring_boot_redis_demo.pojo.User;
import com.example.spring_boot_redis_demo.utils.RedisUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.lettuce.core.RedisCommandTimeoutException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
class SpringBootRedisDemoApplicationTests {

    @Autowired
//    用于操作Redis数据库
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;



    @Test
//    测试我们编写的redisutils
    void test_1(){
        redisUtil.set("name","jc");
        redisUtil.get("name");
        System.out.println("OK");

    }
    @Test
//    测试原生的redistemplate
    void contextLoads() {

//        设置键值对并获取
//        redisTemplate.opsForValue().set("mykey","jc");
//        String name= (String) redisTemplate.opsForValue().get("mykey");




        System.out.println("OK");

    }

    @Test
    void test() throws JsonProcessingException {
        //变量.getClass():得到对象类型
//        User user=new User("我是超哥",24);
////        把对象序列化成字符串了
//        String jsonuser=new ObjectMapper().writeValueAsString(user);
////        对象必须序列化（变成字符串形式）才能被存入redis
//        redisTemplate.opsForValue().set("user",jsonuser);
//        String name= (String) redisTemplate.opsForValue().get("user");


        System.out.println("OK");



    }


}
