package com.jc.proxy.proxy_static.demo1;


//租房客
public class Client {

    public static void main(String[] jc){

//        租房人直接从房东这里租房子
        Host host=new Host();
        host.rent();

        System.out.println("_______________________________");

//        通过房东来实现租房业务，有一些附属操作！
        Proxy proxy=new Proxy(host);
        proxy.rent();
        proxy.seeHouse();
        proxy.fare();




    }


}
