package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * @author <zca>
 * @date 2022-10-20
 */
public interface RegisterService {
    public Map<String, String> register(String username, String password, String confirmedPassword);
}
