package com.example.demo1.properties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "helloservice",ignoreUnknownFields = true)
public class HelloProperties {
    private String name="我是超人";
    private  Integer age=23;


}
