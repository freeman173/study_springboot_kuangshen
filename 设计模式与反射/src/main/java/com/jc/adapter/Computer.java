package com.jc.adapter;


//电脑想上网，但无网线
public class Computer {

//    电脑需要一个转换器才能上网
    public void goNet(NetToUsb adapter){
        adapter.handleRequest();

    }

    public static  void main(String[] atgs){

        Computer computer=new Computer();//电脑
        Adaptee adaptee=new Adaptee();//网线
        Adapter adapter=new Adapter();//转换器

        computer.goNet(adapter);



    }


}
