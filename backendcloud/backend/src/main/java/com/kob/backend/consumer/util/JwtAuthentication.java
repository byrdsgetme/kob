package com.kob.backend.consumer.util;

import com.kob.backend.service.impl.util.JwtUtil;
import io.jsonwebtoken.Claims;

/**
 * @author <zca>
 * @date 2022-11-04
 */
public class JwtAuthentication {

    public static Integer getUserId(String token) {
        int userId = -1; //-1表示不存在
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userId = Integer.parseInt(claims.getSubject());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return userId;
    }

}
