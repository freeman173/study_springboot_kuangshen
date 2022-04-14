package com.example.spring_boot_demo1.dao;


import com.example.spring_boot_demo1.mapper.DepartmentMapper;
import com.example.spring_boot_demo1.mapper.EmployeeMapper;
import com.example.spring_boot_demo1.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



//先模拟数据
@Repository
public class DepartmentDao {


    @Autowired
    DepartmentMapper departmentMapper;

    public HashMap<Integer,String> query_departments(){

        List<Department> departments= departmentMapper.queryDepartmentList();
//        将部门集合转换为hashmap返回即可
        HashMap<Integer, String> departments_map=new HashMap<Integer, String>();
        for(Department department:departments){
            departments_map.put(department.getId(),department.getDepartmentName());
        }
        return departments_map;
    }


}
