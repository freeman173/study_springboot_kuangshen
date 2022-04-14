package com.example.spring_boot_demo2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@SpringBootTest
class SpringBootDemo2ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
//    测试数据库的连接。
    void contextLoads() throws SQLException {
//        查看数据库连接类的类别：“com.zaxxer.hikari.HikariDataSource”类的连接性能最好
        System.out.println(dataSource.getClass());

//        获取数据库连接
        Connection connection= dataSource.getConnection();
        System.out.println(connection);




//        关闭连接
        connection.close();
        System.out.println("ok");
    }



}
