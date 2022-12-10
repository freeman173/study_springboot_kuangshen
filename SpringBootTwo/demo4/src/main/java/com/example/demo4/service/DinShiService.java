package com.example.demo4.service;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DinShiService {

    private static int num=0;


    /*
        cron表达式：
            秒、分、时、日、月、周几

     */
//    每分钟的0秒、20秒、40秒被执行！
    @Scheduled(cron = "0,20,40 */1 * * * ?")
    public void hello(){

        DinShiService.num++;
        System.out.println("hello方法被执行了"+DinShiService.num+"次！");

    }

}
