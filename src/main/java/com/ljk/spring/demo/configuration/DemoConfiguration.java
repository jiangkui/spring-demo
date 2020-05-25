package com.ljk.spring.demo.configuration;

import com.ljk.spring.demo.service.impl.ConfigurationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置
 */
@Configuration
public class DemoConfiguration {

    @Bean
    public ConfigurationImpl testServiceC() {
        return new ConfigurationImpl();
    }
}
