package com.jc.factory.method;

public class BenChiFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new BenChi();
    }
}
