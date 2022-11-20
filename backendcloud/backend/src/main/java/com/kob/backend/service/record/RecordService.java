package com.kob.backend.service.record;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author：zca
 * @Package：com.kob.backend.service
 * @Project：backendcloud
 * @name：RecordService
 * @Date：2022/11/19 13:39
 */
public interface RecordService {
    JSONObject getList(Integer page);
}
