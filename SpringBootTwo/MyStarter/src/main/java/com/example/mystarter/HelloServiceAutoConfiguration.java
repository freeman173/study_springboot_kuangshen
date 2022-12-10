package com.example.mystarter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




@Configuration
@ConditionalOnWebApplication    // 条件配置类，该注解表示在web环境下才生效，相关的其它条件可以使用@ConditionXXX
@EnableConfigurationProperties(HelloProperties.class) // 表示HelloProperties作为配置类使用
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;	// 作为配置类目的就是想在sayHello方法返会的字符串加上前缀和后缀

    @Bean
    public HelloService helloService() { // 将HelloService注入到IOC容器
        HelloService service = new HelloService();
        service.setHelloProperties(helloProperties);
        return service;
    }
}
