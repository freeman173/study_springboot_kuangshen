package com.jc;




/*

第一种实现方法

 */
public class TestThread1 extends Thread{

//    重写run方法
    @Override
    public void run() {
        for (int i =0;i<100;i++){
            System.out.println("    副线程在执行代码！");
        }
    }

    public static void main(String[] args ){
//        这里是主线程的起点

//        创建一个父线程
        TestThread1 testThread1=new TestThread1();
/*

    调用start方法开启副线程（但线程不一定立即执行，需要听从cpu的调度）;

    主线程会跟副线程交替执行！

 */

        testThread1.start();
        for(int i =0;i<500;i++){
            System.out.println("主线程在执行代码！！");
        }




    }



}
