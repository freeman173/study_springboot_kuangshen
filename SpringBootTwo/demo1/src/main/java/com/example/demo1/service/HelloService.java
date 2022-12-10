package com.example.demo1.service;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*

定义一个业务类

 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloService {

    private String name;

    private Integer age;


}
