package com.example.spring_boot_task_demo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

//    执行定时任务
//    使用cron表达式，6个位置分别代表：秒、分、时、日、月、周几
    @Scheduled(cron = "10 10-15 10 * * ?")//每天的10点10分到10点15分
    public void hello(){

        System.out.println("定时执行：hello!!");
    }
}
