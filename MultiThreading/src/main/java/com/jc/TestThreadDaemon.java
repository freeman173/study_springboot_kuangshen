package com.jc;


/*


守护线程：
 */
public class TestThreadDaemon {

    public static void main(String[] jc){

        God god=new God();
        Mortal mortal=new Mortal();


        Thread daemonthread=new Thread(god);
//        设置为守护线程
        daemonthread.setDaemon(true);
        daemonthread.start();


        Thread mortalthread=new Thread(mortal);
        mortalthread.start();




    }

}

//上帝
class God implements Runnable{


    @Override
    public void run() {

        while (true){
            System.out.println("我是上帝，守护凡人！");
        }

    }
}





//凡人
class Mortal implements Runnable{


    @Override
    public void run() {
        for(int i=0;i<365;i++){
            System.out.println("凡人开心地活着");
        }
        System.out.println("--------goodbye,world!------------");
    }
}