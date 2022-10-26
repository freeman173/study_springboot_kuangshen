package com.jc.factory.simple;


/*
简单工厂模式：
    增加新的车，需要修改工厂的代码，不遵循开闭原则的理论，但最实用！


 */
public class CarFactory {

    public static Car getCar(String carName){

        if(carName.equals("BenChi")){
            return new BenChi();
        }else if(carName.equals("DaZong")){
            return new DaZong();
        }else {
            return null;
        }
    }
}
