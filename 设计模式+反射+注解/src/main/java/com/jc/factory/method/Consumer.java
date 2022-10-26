package com.jc.factory.method;


//
public class Consumer {

    public static void main(String[] args){

//        使用工厂方法创建

        Car car=new BenChiFactory().getCar();

        Car car2=new DaZongFactory().getCar();

        car.name();
        car2.name();

        System.out.println("____________________");
    }

}
