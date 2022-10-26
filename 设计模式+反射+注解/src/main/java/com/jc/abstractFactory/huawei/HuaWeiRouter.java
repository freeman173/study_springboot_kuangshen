package com.jc.abstractFactory.huawei;

import com.jc.abstractFactory.abstracts.IRouterProduct;


//华为路由器
public class HuaWeiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void callWife() {
        System.out.println("华为路由器开wife");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置");
    }
}
