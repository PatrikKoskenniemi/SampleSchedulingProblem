package org.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulingService {

    @Scheduled(fixedRate = 1800000)
    public void runScheduledTask() {
        System.out.println("Running scheduledTask");
    }
}
