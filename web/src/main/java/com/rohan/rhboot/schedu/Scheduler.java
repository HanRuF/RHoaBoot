package com.rohan.rhboot.schedu;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/******
 * 定时器任务
 */
@Component
public class Scheduler {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //每隔2秒执行一次
    @Scheduled(fixedRate = 2000)
    public void testTasks1() {
        System.out.println("定时任务执行时间：" + dateFormat.format(new Date()));
    }

    //每天3：05执行
    @Scheduled(cron = "0 05 09 ? * *")
    public void testTasks2() {
        System.out.println("定时任务执行时间：" + dateFormat.format(new Date()));
    }




}
