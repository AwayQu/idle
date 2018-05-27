package com.away1994.idlerest.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    @Async
    public void doWork(Runnable runnable) {
        System.out.println("Got runnable " + runnable);
        runnable.run();
    }
}
