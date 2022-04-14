package com.example.spring_boot_demo2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;



//实现了一张表的增删改查

@RestController
public class JDBCController {

    @Autowired
//           框架配置好了查询模板，直接调用
    JdbcTemplate jdbcTemplate;
    @GetMapping("/student_list")
    public List<Map<String,Object>> userlist(){
        String sql="select * from student";

        List<Map<String,Object>> list_maps=jdbcTemplate.queryForList(sql);

        return list_maps;


    }

    @GetMapping("/adduser")
    public String addUser(){
        String sql="insert into test.student(name,grade) values('蒋超',89)";
        jdbcTemplate.update(sql);

        return "update-ok";
    }

    @GetMapping("/deleteuser/{id}")
    public String deleteUser(@PathVariable("id" )Integer id){
        String sql="delete from test.student where id =?";
        jdbcTemplate.update(sql,id);
        return "delete-ok";
    }

    @GetMapping("/updateuser/{id}")
    public String updateUser(@PathVariable("id" )Integer id){
        String sql="update test.student set name=?,grade=? where id="+id;
        Object[] objects=new Object[2];
        objects[0]="我是超哥";
        objects[1]=90;
        jdbcTemplate.update(sql,objects);
        return "update-ok";
    }


}
