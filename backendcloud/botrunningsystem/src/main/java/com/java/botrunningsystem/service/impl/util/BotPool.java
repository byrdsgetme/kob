package com.java.botrunningsystem.service.impl.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author：zca
 * @Package：com.java.botrunningsystem.service.impl.util
 * @Project：backendcloud
 * @name：BotPool
 * @Date：2022/11/16 23:11
 */

public class BotPool extends Thread{
    private static ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private Queue<Bot> bots = new LinkedList<>();

    public void addBot(Integer userId, String botCode, String input){
        Bot bot = new Bot(userId, botCode, input);
        lock.lock();
        try {
            bots.offer(bot);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        while (true){
            lock.lock();
            if (bots.isEmpty()) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    lock.unlock();
                    break;
                }
            } else {
                Bot bot = bots.poll();
                lock.unlock();
                consume(bot);
            }
        }
    }

    private void consume(Bot bot) {
        Consumer consumer = new Consumer();
        consumer.startTimeout(2000, bot);
    }
}
