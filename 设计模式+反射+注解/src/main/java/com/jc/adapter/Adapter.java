package com.jc.adapter;


/*

真正的适配器：
        把网线与usb给装上：
                 继承网线类，实现usb的接口；
 */
public class Adapter extends Adaptee implements NetToUsb{


    @Override
    public void handleRequest() {
//        插网线
        super.request();
    }
}
