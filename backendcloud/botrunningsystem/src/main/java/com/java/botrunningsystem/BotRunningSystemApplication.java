package com.java.botrunningsystem;

import com.java.botrunningsystem.service.impl.BotRunningServiceImpl;
import com.java.botrunningsystem.service.impl.util.BotPool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author：zca
 * @Package：com.java.botrunningsystem
 * @Project：backendcloud
 * @name：BotRunningSystemApplication
 * @Date：2022/11/16 20:18
 */
@SpringBootApplication
public class BotRunningSystemApplication {
    public static void main(String[] args) {
        BotRunningServiceImpl.botPool.start();
        SpringApplication.run(BotRunningSystemApplication.class, args);
    }
}
