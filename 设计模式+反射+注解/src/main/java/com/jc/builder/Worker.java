package com.jc.builder;


//工人：具体的建造者
public class Worker extends Builder{

    private Product product;

//    需要构建一个新的产品
    public Worker() {
        this.product = new Product();
    }


    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }


    @Override
    void buildB() {
        product.setBuildA("钢筋");
        System.out.println("钢筋");
    }

    @Override
    void buildC() {
        product.setBuildA("电线");
        System.out.println("电线");
    }
    @Override
    void buildD() {
        product.setBuildA("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
