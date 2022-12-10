package com.example.demo3.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value ="employees")
public class Employee {
    private Integer id;
    private String lastName;
    private  String email;
    private Integer gender;//女：0  男：1
    private Integer departmentId;
    private Date birth;

}
