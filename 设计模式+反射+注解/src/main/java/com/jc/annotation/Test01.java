package com.jc.annotation;

import java.util.ArrayList;
import java.util.List;


/*

内置注解的简单使用

 */
public class Test01 extends Object{

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public static void test(){
        System.out.println("我是一个被废弃的测试方法！");
    }


    @SuppressWarnings("all")
    public void test2(){
        List list=new ArrayList();
    }

    public static void main(String[] jc){

        Test01.test();
    }

}
