package com.example.demo5;

import com.example.demo5.mapper.DepartmentMapper;
import com.example.demo5.mapper.StudentGradeMapper;
import com.example.demo5.mapper.StudentMapper;
import com.example.demo5.mapper.TeacherMapper;
import com.example.demo5.params.ParamOne;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo5ApplicationTests {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    StudentGradeMapper studentGradeMapper;


    @Test
    void contextLoads() {

        ParamOne paramOne=new ParamOne();
        paramOne.setAge(28);paramOne.setGrade(80);


        Object result=studentGradeMapper.selectStudentsByConditions(paramOne);



        System.out.println("____________");

    }

}
