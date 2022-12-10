package com.example.demo5.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherTwo {
    private Integer id;
    private String name;
//    一个老师有多个学生
    private List<StudentTwo> students;

}
