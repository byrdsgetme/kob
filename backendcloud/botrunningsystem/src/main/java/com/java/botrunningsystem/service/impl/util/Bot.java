package com.java.botrunningsystem.service.impl.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author：zca
 * @Package：com.java.botrunningsystem.service.impl.util
 * @Project：backendcloud
 * @name：bot
 * @Date：2022/11/16 23:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bot {
    private Integer userId;
    private String botCode;
    private String input;

}
