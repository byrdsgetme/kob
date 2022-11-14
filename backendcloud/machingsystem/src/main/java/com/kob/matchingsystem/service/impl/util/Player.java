package com.kob.matchingsystem.service.impl.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author：zca
 * @Package：com.kob.matchingsystem.service.impl.util
 * @Project：backendcloud
 * @name：Player
 * @Date：2022/11/14 16:00
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private Integer userId;
    private Integer rating;
    private Integer waitingTime;
}
