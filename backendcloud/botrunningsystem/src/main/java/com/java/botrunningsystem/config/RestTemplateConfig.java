package com.java.botrunningsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author：zca
 * @Package：com.kob.backend.config
 * @Project：backendcloud
 * @name：RestTemplateConfig
 * @Date：2022/11/14 14:44
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
