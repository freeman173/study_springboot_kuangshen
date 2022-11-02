package com.jc.proxy_static.demo1;


//房东
public class Host2 implements Rent{


    @Override
    public void rent() {
        System.out.println("二房东要出租房子！");
    }
}
