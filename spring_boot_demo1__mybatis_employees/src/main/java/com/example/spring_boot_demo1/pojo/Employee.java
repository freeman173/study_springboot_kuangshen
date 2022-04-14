package com.example.spring_boot_demo1.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private  String email;
    private Integer gender;//女：0  男：1
    private Integer departmentid;
    private Date birth;

}
