package com.jc.proxy_static.demo1;


//房屋中介：代理房东做租房业务
public class Proxy implements Rent{

//    优先采用组合的方式来代理房东
    private Host host;

//    构造方法
    public Proxy() {
    }
    public Proxy(Host host) {
        this.host = host;
    }

//   代理实现租房业务
    @Override
    public void rent() {
        System.out.println("这里是中介境内！");
        host.rent();
    }

//    房东的一些附属操作
    public void seeHouse() {

        System.out.println("中介带你看房！");
    }

    public void fare() {

        System.out.println("中介收房租了！");
    }

}
