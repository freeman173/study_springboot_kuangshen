package com.example.spring_boot_redis_demo.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor//ALT+回车	导入包,自动修正
@Data
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;

}
