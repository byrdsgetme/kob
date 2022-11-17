package com.java.botrunningsystem.controller;

import com.java.botrunningsystem.service.BotRunningService;
import com.java.botrunningsystem.service.impl.BotRunningServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @Author：zca
 * @Package：com.java.botrunningsystem.controller
 * @Project：backendcloud
 * @name：BotRunningController
 * @Date：2022/11/16 20:21
 */
@RestController
public class BotRunningController {

    @Autowired
    private BotRunningService botRunningService;

    @PostMapping("/bot/add/")
    public String addBot(@RequestParam MultiValueMap<String, String> data){
        Integer userId = Integer.parseInt(Objects.requireNonNull(data.getFirst("user_id")));
        String  botCode = data.getFirst("bot_code");
        String input = data.getFirst("input");
        return botRunningService.addBot(userId, botCode, input);
    }

}
