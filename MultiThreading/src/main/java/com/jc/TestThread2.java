package com.jc;


/*

实现的第二种方式：继承runnable接口

 */
public class TestThread2 implements Runnable{

    public void run() {
        for (int i =0;i<100;i++){
//            获取当前线程1的名字
            System.out.println("    "+Thread.currentThread().getName()+"在执行代码！");
        }
    }

    public static void main(String[] args ){
//        这里是主线程的起点


//        创建Runnable接口的实现类
        TestThread2 testThread2=new TestThread2();
//        创建线程对象来开启线程(把需要被代理的实现类丢进去)
        Thread thread1=new Thread(testThread2, "jc1");
//        开启副线程
        thread1.start();

//       创建线程对象来开启线程(把需要被代理的实现类丢进去)
        Thread thread2=new Thread(testThread2,"jc2");
//        开启副线程
        thread2.start();



//        来一个lambda表达式
        Runnable testThread3=()->{
            for (int i =0;i<100;i++){
//            获取当前线程1的名字
                System.out.println("    "+Thread.currentThread().getName()+"在执行代码！");
            }

        };
        Thread thread3=new Thread(testThread3,"jc3");
        thread3.start();


        for(int i =0;i<500;i++){
            System.out.println("主线程在执行代码！！");
        }




    }






}
