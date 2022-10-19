package com.jc.factory.simple;


//
public class Consumer {

    public static void main(String[] args){

//        使用工厂创建

        Car car=CarFactory.getCar("BenChi");
        car.name();
        Car car2=CarFactory.getCar("DaZong");
        car2.name();

        System.out.println("____________________");
    }

}
