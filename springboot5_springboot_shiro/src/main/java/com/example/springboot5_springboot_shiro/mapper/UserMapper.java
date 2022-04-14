package com.example.springboot5_springboot_shiro.mapper;


import com.example.springboot5_springboot_shiro.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper//表明这是一个mybatis的mapper类
@Repository
public interface UserMapper {
      public User queryuserbyname(String name);


}
