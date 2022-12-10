package com.example.demo1.config;


import com.example.demo1.properties.HelloProperties;
import com.example.demo1.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
//存在则生效
@ConditionalOnClass(value = HelloService.class)
//导入自定义的配置类供当前类使用
@EnableConfigurationProperties(value = HelloProperties.class)
//即使.yaml配置文件中无对应属性值，也可以正常使用
@ConditionalOnProperty(prefix = "jc.config",name = "flag",havingValue = "true",matchIfMissing = true)

public class HelloAutoConfiguration {

   /*
   @Component 和 @Bean 是使用注解来定义bean的两种方式：

        @Component:
                需要和类定义放在一起

        @Bean:
                不需要和类定义放在一起
    */


    @Bean
    /*
    当你的bean被注册之后，如果而注册相同类型的bean，就不会成功，它会保证你的bean只有一个，即你的实例只有一个。
     */
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService(HelloProperties helloProperties){
        HelloService helloService=new HelloService();
        helloService.setName(helloProperties.getName());
        helloService.setAge(helloProperties.getAge());
        return helloService;


    }

}
