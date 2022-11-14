package com.kob.backend.controller.user.bot;

import com.kob.backend.service.user.bot.RemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author <zca>
 * @date 2022-10-27
 */
@RestController
public class RemoveController {

    @Autowired
    private RemoveService removeService;

    @PostMapping("/user/bot/remove/")
    Map<String, String> remove(@RequestParam Map<String, String> data){
        return removeService.remove(data);
    }
}
