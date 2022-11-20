package com.kob.backend.controller.record;

import com.alibaba.fastjson.JSONObject;
import com.kob.backend.service.record.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author：zca
 * @Package：com.kob.backend.controller.record
 * @Project：backendcloud
 * @name：RecordController
 * @Date：2022/11/19 14:16
 */
@RestController
public class RecordController {

    @Autowired
    RecordService recordService;

    @GetMapping("/record/getlist/")
    JSONObject getList(@RequestParam Map<String, String> data){
        Integer page = Integer.parseInt(data.get("page"));
        return  recordService.getList(page);
    }

}
