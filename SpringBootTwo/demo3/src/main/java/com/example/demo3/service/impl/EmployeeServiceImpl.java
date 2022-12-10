package com.example.demo3.service.impl;

import com.example.demo3.dao.EmployeeMapper;
import com.example.demo3.pojo.Employee;
import com.example.demo3.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public List<Employee> selectAll() {
        return employeeMapper.selectList(null);
    }
}
