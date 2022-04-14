package com.example.spring_boot_task_demo.service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async//声明该方法为异步方法，程序执行时会将该函数放到一个单独的线程池里并继续执行后面的任务，不影响用户体验。
    public void hello(){
        try{
//            程序休息3s！！
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("数据正在处理……");
    }
}
