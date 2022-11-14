package com.kob.backend.controller.user.bot;

import com.kob.backend.pojo.Bot;
import com.kob.backend.service.user.bot.GetListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author <zca>
 * @date 2022-10-27
 */
@RestController
public class GetListController {

    @Autowired
    private GetListService getListService;

    @GetMapping("/user/bot/getlist/")
    List<Bot> getList(){
        return getListService.getList();
    }

}
