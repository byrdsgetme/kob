package com.kob.backend.service.impl.user.bot;

import com.kob.backend.mapper.BotMapper;
import com.kob.backend.pojo.Bot;
import com.kob.backend.pojo.User;
import com.kob.backend.service.impl.UserDetailsImpl;
import com.kob.backend.service.user.bot.RemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <zca>
 * @date 2022-10-27
 */
@Service
public class RemoveServiceImpl implements RemoveService {

    @Autowired
    private BotMapper botMapper;
    @Override
    public Map<String, String> remove(Map<String, String> data) {
        UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();

        User user = loginUser.getUser();

        Map<String, String> map = new HashMap<>();
        Integer botId = Integer.parseInt(data.get("bot_id"));
        Bot bot = botMapper.selectById(botId);

        if (bot == null){
            map.put("error_message","Bot不存在或已被删除");
            return map;
        }
        if (!bot.getUserId().equals(user.getId())){
            map.put("error_message","没有权限删除该Bot");
            return map;
        }

        botMapper.deleteById(botId);
        map.put("error_message","success");
        return map;
    }
}
