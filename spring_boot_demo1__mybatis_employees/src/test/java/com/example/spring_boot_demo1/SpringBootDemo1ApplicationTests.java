package com.example.spring_boot_demo1;

import com.example.spring_boot_demo1.dao.DepartmentDao;
import com.example.spring_boot_demo1.dao.EmployeeDao;
import com.example.spring_boot_demo1.pojo.Department;
import com.example.spring_boot_demo1.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


@SpringBootTest
class SpringBootDemo1ApplicationTests {

    @Autowired
//    @Resource
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @Test//测试函数模块
    void contextLoads() {

//

//        List<Employee> employee=employeeDao.query_employees();
//        employeeDao.add_employee(new Employee(null,"狗","1222@dldl",0,104,new Date()));
//        employeeDao.update_employee(new Employee(9,"大狗","234234@qq.com",1,102,new Date()));

//        System.out.println(departmentDao.getdepartmentnamebyid(101));
        HashMap<Integer,String> departments=departmentDao.query_departments();
        String name=departments.get(101);

        System.out.println("oK");




    }

}
