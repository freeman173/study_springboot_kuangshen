package com.jc;

/*

线程插队
 */
public class TestThreadJoin implements Runnable {


    @Override
    public void run() {
        for(int i=0;i<10000;i++){

            System.out.println("    副线程正在执行！");
        }
    }

    public static void main(String[] jc) throws InterruptedException {
//        副线程开始执行
        TestThreadJoin testThreadJoin=new TestThreadJoin();
        Thread thread=new Thread(testThreadJoin);
        thread.start();

//        主线程作为参照
        for(int i=0;i<1000;i++){
            if(i==900){

                thread.join();//副线程强制插队（执行完后才让出当前处理器）
            }
            System.out.println("主线程正在执行！");

        }




    }




}
