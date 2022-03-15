package com.xqf.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Classname MyScheduled
 * @Date 2021/12/7
 * @Author xqf
 */

@Component
public class MyScheduled {

    @Scheduled(cron = "0/2 * * * * *")   //Seconds Minutes Hours Day Month Week Year  0/2:第0秒开始每隔2秒
    public void getTime() {
        System.out.println("方法执行：" + new Date().toLocaleString());
    }
}
