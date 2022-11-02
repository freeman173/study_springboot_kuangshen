package com.jc.pojo;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.lang.reflect.Field;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

//    定义主键的增加策略
    @TableId(type = IdType.AUTO)
    private int id;
    private String name;
    private int age;
    private String email;
//    自动填充
    @TableField(fill=FieldFill.INSERT)
    private Date createTime;
    @TableField(fill=FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
