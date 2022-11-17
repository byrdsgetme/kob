package com.java.botrunningsystem.service.impl.util;

import com.java.botrunningsystem.util.BotInterface;
import org.joor.Reflect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

/**
 * @Author：zca
 * @Package：com.java.botrunningsystem.service.impl.util
 * @Project：backendcloud
 * @name：Consumer
 * @Date：2022/11/17 12:00
 */
@Component
public class Consumer extends Thread{
    private Bot bot;

    private static RestTemplate restTemplate;

    private final static String receiveBotMoveUrl = "http://127.0.0.1:3000/pk/receive/bot/move/";

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        Consumer.restTemplate = restTemplate;
    }

    public void startTimeout(long timeout,Bot bot) {
        this.bot = bot;
        this.start();

        try {
            this.join(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.interrupt();
        }
    }

    private String addUid(String code, String uid){
        int k = code.indexOf(" implements com.java.botrunningsystem.util.BotInterface");
        return code.substring(0, k) + uid + code.substring(k);
    }

    @Override
    public void run() {
        UUID uuid = UUID.randomUUID();
        String uid = uuid.toString().substring(0, 8);

        BotInterface botInterface = Reflect.compile(
                "com.java.botrunningsystem.util.bot" + uid,
                addUid(bot.getBotCode(), uid)
        ).create().get();

        Integer direction = botInterface.nextMove(bot.getInput());

        MultiValueMap<String, String> data = new LinkedMultiValueMap<>();

        data.add("user_id",bot.getUserId().toString());
        data.add("direction", direction.toString());
        restTemplate.postForObject(receiveBotMoveUrl, data, String.class);
    }
}
