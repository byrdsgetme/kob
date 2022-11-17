package com.kob.backend.controller.pk;

import com.kob.backend.service.ReceiveBotMoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @Author：zca
 * @Package：com.kob.backend.controller.pk
 * @Project：backendcloud
 * @name：ReceiveBotMoveController
 * @Date：2022/11/17 14:35
 */
@RestController
public class ReceiveBotMoveController {
    @Autowired
    private ReceiveBotMoveService receiveBotMoveService;

    @PostMapping("/pk/receive/bot/move/")
    String receiveBotMove(@RequestParam MultiValueMap<String, String> data){
        Integer userId = Integer.parseInt(Objects.requireNonNull(data.getFirst("user_id")));
        Integer direction = Integer.parseInt(Objects.requireNonNull(data.getFirst("direction")));
        return receiveBotMoveService.receiveBotMove(userId, direction);
    }
}
