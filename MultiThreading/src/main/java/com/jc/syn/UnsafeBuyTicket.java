package com.jc.syn;




/*

不安全买票：
        两个甚至多个线程同时访问同一变量，导致出票结果紊乱。

 */
public class UnsafeBuyTicket {

   public static void main(String[] jc){

       BuyTicket buyTicket=new BuyTicket();
       new Thread(buyTicket,"超人").start();
       new Thread(buyTicket,"刘琪").start();
       new Thread(buyTicket,"黄牛").start();


   }
}


class BuyTicket implements Runnable{

//    票
    private int ticketNums=10;
//  中断标识符
    boolean flag=true;

    @Override
    public void run() {
        while (this.flag){
            try {
                this.buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


//synchronized:同步方法，给方法所在的对象“this”加上了一把锁！
    private synchronized void buy() throws InterruptedException {
//        如果无车票，线程停止运行
        if(this.ticketNums==0){
            this.flag=false;
        }
//        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+"拿到"+this.ticketNums--+"票！");

    }





}