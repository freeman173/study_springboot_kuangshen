package com.jc.syn;

import java.util.ArrayList;
import java.util.List;


/*

线程不安全集合：
 */
public class UnsafeList {

    public static void main(String[] args) throws InterruptedException {

        List<String> list=new ArrayList<String>();

        /*

        在这10000个线程中，有些线程在列表同一位置放置了数据，导致最终的列表尺寸只有不到10000；
         */
        for(int i=0;i<10000;i++){
            new Thread(()->{
//                给同步对象加上了一把锁，实现同步（好像没效果）
                synchronized (list){list.add(Thread.currentThread().getName());}
            }).start();

        }

        System.out.println(list.size());

    }



}
