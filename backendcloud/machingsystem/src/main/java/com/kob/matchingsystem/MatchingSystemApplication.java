package com.kob.matchingsystem;

import com.kob.matchingsystem.service.impl.MatchingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author：zca
 * @Package：com.kob.matchingsystem
 * @Project：backendcloud
 * @name：MatchingSystemApplication
 * @Date：2022/11/13 0:44
 */
@SpringBootApplication
public class MatchingSystemApplication {

    public static void main(String[] args) {
        MatchingServiceImpl.matchingPool.start();
        SpringApplication.run(MatchingSystemApplication.class, args);
    }
}
