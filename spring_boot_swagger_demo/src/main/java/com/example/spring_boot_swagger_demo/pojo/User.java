package com.example.spring_boot_swagger_demo.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户实体类")//在swagger中的类注释名
public class User {
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("密码")
    private String password;

}
