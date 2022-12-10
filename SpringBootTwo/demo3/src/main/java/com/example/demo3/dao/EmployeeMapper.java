package com.example.demo3.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo3.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {



}
