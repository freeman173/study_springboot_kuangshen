package com.example.demo4.service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

/*
@Async：标记这是一个异步方法，框架调用时会自动开启一个线程来执行它，免得其打扰主线的任务！
 */
    @Async
    public void hello()  {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("数据正在处理…………");

    }

}
