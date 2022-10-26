package com.jc;


/*

观测线程的状态
 */
public class TestThreadState implements Runnable{

    @Override
    public void run() {
        System.out.println("超人是个帅哥！");
    }

    public static void main(String[] jc){

        TestThreadState testThreadState=new TestThreadState();
        Thread thread=new Thread(testThreadState,"a");

//        未启动之前的线程状态
        Thread.State state1=thread.getState();

//        启动之后的线程状态
        thread.start();
        Thread.State state2=thread.getState();


        System.out.println("-----------------");


    }

}
