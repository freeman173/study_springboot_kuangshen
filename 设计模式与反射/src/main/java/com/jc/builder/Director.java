package com.jc.builder;


/*
指挥：负责指挥一个工程；工程如何构建由他确定
 */
public class Director {

    public Product bulid(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.getProduct();
    }



}
