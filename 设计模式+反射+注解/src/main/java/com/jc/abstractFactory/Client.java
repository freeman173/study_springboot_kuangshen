package com.jc.abstractFactory;

import com.jc.abstractFactory.abstracts.IRouterProduct;
import com.jc.abstractFactory.abstracts.IphoneProduct;
import com.jc.abstractFactory.xiaomi.XiaoMiFactory;

//客户端
public class Client {

    public static void main(String[] jc){

        System.out.println("___________小米产品__________");

//        小米工厂
        XiaoMiFactory xiaoMiFactory=new XiaoMiFactory();
//        通过工厂得到小米的产品
        IphoneProduct iphoneProduct=xiaoMiFactory.iphoneProduct();
        IRouterProduct iRouterProduct=xiaoMiFactory.routerProduct();

        iphoneProduct.start();
        iRouterProduct.start();

        System.out.println("__________END__________");


    }


}
