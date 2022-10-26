package com.jc;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*

第三种实现方式：Callable接口；了解一下即可
 */
public class TestThread4 implements Callable<Boolean> {


    public Boolean call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"在执行代码！");
        return true;
    }


    public static void main(String[] args){
//        创建实例类
        TestThread4 t1=new TestThread4();
        TestThread4 t2=new TestThread4();
        TestThread4 t3=new TestThread4();

//创建执行服务对象：
        ExecutorService executorService= Executors.newFixedThreadPool(3);
//        提交线程
        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
//关闭服务
        executorService.shutdown();




    }








}
