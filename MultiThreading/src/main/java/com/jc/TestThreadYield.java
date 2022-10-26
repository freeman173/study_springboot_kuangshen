package com.jc;


/*
 Thread.yield():当前线程退出处理器，然后再跟其他等待的线程抢这个处理器

 */
public class TestThreadYield {

   public static void main(String[] jc){

       MyYield myYield=new MyYield();
       new Thread(myYield,"a").start();
       new Thread(myYield,"b").start();
       new Thread(myYield,"c").start();
       new Thread(myYield,"d").start();
   }



}


class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行！");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程停止执行！");
    }
}