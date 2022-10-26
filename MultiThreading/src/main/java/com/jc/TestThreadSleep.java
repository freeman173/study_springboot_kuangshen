package com.jc;


/*

模拟倒计时
 */
public class TestThreadSleep {

    public static void CountDown() throws InterruptedException {

        int num=10;
        while(true){

            Thread.sleep(1000);
            System.out.println(num--);
            if(num==0){
                break;
            }
        }

    }

    public static void main(String[] jc) throws InterruptedException {
        TestThreadSleep.CountDown();
    }


}
