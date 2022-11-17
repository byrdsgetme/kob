package com.kob.backend.service.impl.user.pk;

import com.kob.backend.consumer.WebSocketServer;
import com.kob.backend.consumer.util.Game;
import com.kob.backend.service.ReceiveBotMoveService;
import org.springframework.stereotype.Service;

/**
 * @Author：zca
 * @Package：com.kob.backend.service.impl.user.pk
 * @Project：backendcloud
 * @name：ReceiveBotMoveServiceImpl
 * @Date：2022/11/17 14:33
 */
@Service
public class ReceiveBotMoveServiceImpl implements ReceiveBotMoveService {

    public String receiveBotMove(Integer userId, Integer direction) {
        System.out.println("receive botmove: " + userId + " " + direction + " " + WebSocketServer.users.get(userId));
        if (WebSocketServer.users.get(userId) != null){
            Game game = WebSocketServer.users.get(userId).game;

            if (game != null) {
                if (game.getPlayerA().getId().equals(userId)) {
                    game.setNextStepA(direction);
                } else if (game.getPlayerB().getId().equals(userId)) {
                    game.setNextStepB(direction);
                }
            }

        }
        return "receive botmove successs";
    }
}
