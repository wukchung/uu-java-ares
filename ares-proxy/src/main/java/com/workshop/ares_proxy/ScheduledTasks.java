package com.workshop.ares_proxy;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    // Method to be executed every 5 seconds
    @Scheduled(fixedRate = 5000)
    public void updateData() {
        System.out.println("Fixed rate task - " + System.currentTimeMillis() / 1000);
    }
    
    @Scheduled(cron = "0 * * * * ?")
    public void cronTask() {
        System.out.println("Cron task - " + System.currentTimeMillis() / 1000);
    }
}
