package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author <zca>
 * @date 2022-10-19
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
