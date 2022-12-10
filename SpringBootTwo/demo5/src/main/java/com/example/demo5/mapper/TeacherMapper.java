package com.example.demo5.mapper;


import com.example.demo5.pojo.TeacherTwo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface TeacherMapper {


    public List<TeacherTwo> selectTeacherTwos();



}
