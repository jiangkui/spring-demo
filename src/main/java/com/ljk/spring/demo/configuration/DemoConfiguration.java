package com.ljk.spring.demo.configuration;

import com.ljk.spring.demo.service.ConfigurationTypeImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置
 */
@Configuration
public class DemoConfiguration {

    @Bean
    public ConfigurationTypeImpl testServiceC() {
        return new ConfigurationTypeImpl();
    }
}
