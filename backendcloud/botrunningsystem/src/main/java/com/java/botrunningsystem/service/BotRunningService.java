package com.java.botrunningsystem.service;

/**
 * @Author：zca
 * @Package：com.java.botrunningsystem.service
 * @Project：backendcloud
 * @name：BotRunningService
 * @Date：2022/11/16 20:22
 */
public interface BotRunningService {
    String addBot(Integer userId, String botCode, String input);
}
