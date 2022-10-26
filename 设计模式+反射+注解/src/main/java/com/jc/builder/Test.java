package com.jc.builder;

public class Test {

    public static void main(String[] jc){
//        来一个指挥者
        Director director=new Director();

//        指挥特定的工人完成产品
        Product product=director.bulid(new Worker());
        System.out.println(product.toString());


    }

}
