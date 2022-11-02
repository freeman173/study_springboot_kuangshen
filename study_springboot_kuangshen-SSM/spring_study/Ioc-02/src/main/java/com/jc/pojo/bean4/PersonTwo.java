package com.jc.pojo.bean4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class PersonTwo {

    @Autowired
    private Ant ant;
    @Autowired
    @Qualifier("bird02")
    private Bird bird;
    private String name;

    public Ant getAnt() {
        return ant;
    }

    public Bird getBird() {
        return bird;
    }

    public String getName() {
        return name;
    }


}
