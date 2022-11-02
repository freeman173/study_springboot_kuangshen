package com.jc.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {


    private String name;

    public String getName() {
        return name;
    }

    @Value("小沈")
    public void setName(String name) {
        this.name = name;
    }


}
