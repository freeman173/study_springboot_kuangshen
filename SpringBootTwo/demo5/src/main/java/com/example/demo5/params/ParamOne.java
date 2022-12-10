package com.example.demo5.params;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParamOne {

    private String name;
    private String sex;
    private int age;
    private String height;
    private int grade;


}
