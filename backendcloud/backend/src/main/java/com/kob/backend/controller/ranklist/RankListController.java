package com.kob.backend.controller.ranklist;

import com.alibaba.fastjson.JSONObject;
import com.kob.backend.service.ranklist.RankListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author：zca
 * @Package：com.kob.backend.controller.ranklist
 * @Project：backendcloud
 * @name：RankListController
 * @Date：2022/11/19 16:30
 */
@RestController
public class RankListController {
    @Autowired
    private RankListService rankListService;

    @GetMapping("/ranklist/getlist/")
    JSONObject getList(@RequestParam Map<String, String> data){
        Integer page = Integer.parseInt(data.get("page"));
        return rankListService.getList(page);
    }
}
