package com.example.demo5.mapper;


import com.example.demo5.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Mapper
//查询学生这个角度：学生与老师为一对一的关系；每个学生对象里面有一个老师对象
public interface StudentMapper {


    public List<Student> selectStudents();





}
