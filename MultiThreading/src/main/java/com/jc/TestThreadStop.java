package com.jc;

/*

线程停止：建议设置一个标志位即可。


 */

public class TestThreadStop implements Runnable{

//  1、  设置一个标识位
    private boolean flag=true;

    @Override
    public void run() {
        int i=0;
        while(this.flag){
            System.out.println(Thread.currentThread().getName()+"正在运行"+i++);
        }

    }

//  2、设置一个公开的方法停止线程（转换标志位）
    public void stop(){
        this.flag=false;
    }


    public  static void main(String[] args){

        TestThreadStop testThreadStop=new TestThreadStop();

//        副线程开始执行
        new Thread(testThreadStop).start();

//        这里来一个主线程作参考
        for(int i=0;i<1000000;i++){

            if(i==800000){
                testThreadStop.stop();
                System.out.println("线程该停止了！");
            }

        }




    }




}
