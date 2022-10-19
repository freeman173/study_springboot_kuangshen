package com.jc.abstractFactory.xiaomi;

import com.jc.abstractFactory.abstracts.IRouterProduct;


//小米路由器
public class XiaoMiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("小米路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器关机");
    }

    @Override
    public void callWife() {
        System.out.println("小米路由器开wife");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置");
    }
}
