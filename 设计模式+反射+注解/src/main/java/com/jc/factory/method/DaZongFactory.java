package com.jc.factory.method;

public class DaZongFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new DaZong();
    }
}
