package com.example.demo1.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.sql.DataSourceDefinition;

@Data
@NoArgsConstructor
@AllArgsConstructor
//设置为一个配置类,在配置文件中读取
//该注解使得我们可以在.yaml中配置类的属性值
@ConfigurationProperties(prefix = "person",ignoreUnknownFields = true)
@Component
//@EnableConfigurationProperties
public class Person {

//    @Value("${person.name}")
    private String name;
//    @Value("${person.age}")
    private Integer age;

}
