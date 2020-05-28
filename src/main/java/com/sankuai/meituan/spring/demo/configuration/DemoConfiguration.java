package com.sankuai.meituan.spring.demo.configuration;

import com.ljk.spring.demo.service.impl.ConfigurationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置
 */
@Configuration
public class DemoConfiguration {

    @Bean
    public ConfigurationImpl configurationImpl() {
        return new ConfigurationImpl();
    }
}
