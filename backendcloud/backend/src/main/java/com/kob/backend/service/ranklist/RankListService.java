package com.kob.backend.service.ranklist;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author：zca
 * @Package：com.kob.backend.service.ranklist
 * @Project：backendcloud
 * @name：RankListService
 * @Date：2022/11/19 16:20
 */
public interface RankListService {
    JSONObject getList(Integer page);
}
