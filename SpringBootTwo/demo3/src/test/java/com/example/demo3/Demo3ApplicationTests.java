package com.example.demo3;

import com.example.demo3.dao.EmployeeMapper;
import com.example.demo3.service.EmployeeService;
import com.example.demo3.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo3ApplicationTests {

    @Autowired
    EmployeeServiceImpl employeeServiceimpl;


    @Test
    void contextLoads() {

        Object object=employeeServiceimpl.selectAll();


        System.out.println("_________");

    }

}
