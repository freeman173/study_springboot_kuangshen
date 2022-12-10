package com.example.demo5.mapper;


import com.example.demo5.params.ParamOne;
import com.example.demo5.pojo.Student;
import com.example.demo5.pojo.StudentThree;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Mapper
public interface StudentGradeMapper {


    public List<StudentThree> selectStudents();
    public List<StudentThree> selectStudentsByConditions(ParamOne paramOne);




}
