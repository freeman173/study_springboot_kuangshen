package com.example.demo5.mapper;

import com.example.demo5.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface DepartmentMapper {

     List<Department> selectAll();

}
