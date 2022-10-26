package com.jc;


/*
买票问题：
    多个人（线程）买一张票

    多个线程抢一个资源时，有些问题需要处理！

 */

public class TestThread3 implements Runnable{


//    票数
    private int tickNums=10;

    public void run() {
//        持续抢票
        while(true){
//            票没了就不抢了
            if(this.tickNums==0){
                break;
            }
//            线程休息一会，给其他线程一个机会
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"拿到了第"+tickNums--+"票");
        }


    }


    public static void main(String[] args) {

        TestThread3 testThread3=new TestThread3();

        new Thread(testThread3,"蒋超").start();

        new Thread(testThread3,"刘琪").start();

        new Thread(testThread3,"刘涛").start();

        new Thread(testThread3,"正林").start();
    }


}
