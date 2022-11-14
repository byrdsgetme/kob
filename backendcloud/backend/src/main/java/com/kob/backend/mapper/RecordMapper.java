package com.kob.backend.mapper;

/**
 * @author <zca>
 * @date 2022-11-11
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.Record;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordMapper extends BaseMapper<Record> {
}