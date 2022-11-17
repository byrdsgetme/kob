package com.java.botrunningsystem.service.impl;

import com.java.botrunningsystem.service.BotRunningService;
import com.java.botrunningsystem.service.impl.util.BotPool;
import org.springframework.stereotype.Service;

/**
 * @Author：zca
 * @Package：com.java.botrunningsystem.service.impl
 * @Project：backendcloud
 * @name：BotRunningServiceImpl
 * @Date：2022/11/16 20:22
 */
@Service
public class BotRunningServiceImpl implements BotRunningService {
    public final static BotPool botPool = new BotPool();
    @Override
    public String addBot(Integer userId, String botCode, String input) {
        System.out.println("add bot: " + userId + " " + botCode + " " + input);
        botPool.addBot(userId, botCode, input);
        return "add bot success";
    }
}
