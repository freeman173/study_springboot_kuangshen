package com.jc.builder;


//抽象的建造者
public abstract class Builder {

    abstract void buildA();//打地基
    abstract void buildB();//打钢筋
    abstract void buildC();//铺电线
    abstract void buildD();//粉刷

//    完工:得到产品
    abstract Product getProduct();



}
