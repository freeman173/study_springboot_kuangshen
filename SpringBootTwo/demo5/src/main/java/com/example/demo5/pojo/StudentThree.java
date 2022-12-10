package com.example.demo5.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentThree {
    private Integer id;
    private String name;
    private String sex;
    private int age;
    private String height;
    private int grade;
}
