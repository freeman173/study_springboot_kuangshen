package com.example.spring_boot_demo1.mapper;


import com.example.spring_boot_demo1.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper//表明这是一个mybatis的mapper类
@Repository
public interface EmployeeMapper {
        List<Employee> queryEmployeeList();
        Employee queryEmploybyId(Integer id);
        int addEmployee(Employee employee);
        int updateEmployee(Employee employee);
        int deleteEmployee(Integer id);

}
