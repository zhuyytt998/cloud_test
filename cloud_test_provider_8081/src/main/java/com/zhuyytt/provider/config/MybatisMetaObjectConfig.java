package com.zhuyytt.provider.config;

import com.zhuyytt.provider.handler.MybatisMetaObjectHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisMetaObjectConfig
 *
 * @author zhuyytt
 * @date 2021/10/26
 */
@Configuration
public class MybatisMetaObjectConfig {

    @Bean
    public MybatisMetaObjectHandler mybatisMetaObjectHandler() {
        return new MybatisMetaObjectHandler();
    }

}
