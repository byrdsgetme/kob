package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * @author <zca>
 * @date 2022-10-20
 */
public interface LoginService {
    public Map<String, String> getToken(String usernamem,String password);
}
