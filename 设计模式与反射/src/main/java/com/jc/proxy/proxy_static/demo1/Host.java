package com.jc.proxy.proxy_static.demo1;


//房东
public class Host implements Rent{


    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
