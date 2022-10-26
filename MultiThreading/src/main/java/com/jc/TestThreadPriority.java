package com.jc;


/*


测试线程优先级：
    优先级越高，被处理器调度的概率就越高！


 */
public class TestThreadPriority implements Runnable{
    @Override
    public void run() {
//        打印当前线程的优先级
        System.out.println(Thread.currentThread().getName()+"--->"+Thread.currentThread().getPriority());

    }

    public static void main(String[] jc){

        TestThreadPriority testThreadPriority=new TestThreadPriority();

//        创建线程并设置优先级
        Thread t1=new Thread(testThreadPriority,"1");
        t1.setPriority(1);
        Thread t2=new Thread(testThreadPriority,"2");
        t2.setPriority(2);
        Thread t3=new Thread(testThreadPriority,"3");
        t3.setPriority(3);




        t1.start();t2.start();t3.start();




    }



}
