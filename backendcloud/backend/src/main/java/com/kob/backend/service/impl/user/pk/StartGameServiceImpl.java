package com.kob.backend.service.impl.user.pk;

import com.kob.backend.consumer.WebSocketServer;
import com.kob.backend.service.user.pk.StartGameService;
import org.springframework.stereotype.Service;

/**
 * @Author：zca
 * @Package：com.kob.backend.service.impl.user.pk
 * @Project：backendcloud
 * @name：StartGameServiceImpl
 * @Date：2022/11/14 17:29
 */
@Service
public class StartGameServiceImpl implements StartGameService {
    @Override
    public String startGame(Integer aId, Integer aBotId, Integer bId, Integer bBotId) {
        System.out.println("start game: " + aId + " " + aBotId + " "+ bId + " " + bBotId);
        WebSocketServer.startGame(aId, aBotId, bId, bBotId);
        return "start game success";
    }
}
