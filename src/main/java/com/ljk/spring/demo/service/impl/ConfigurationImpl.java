package com.ljk.spring.demo.service.impl;

import com.ljk.spring.demo.service.BeanTypeService;

/**
 * 在 @Configuration 中配置的实现
 */
public class ConfigurationImpl implements BeanTypeService {

    @Override
    public String showType() {
        return "ConfigurationTypeImpl";
    }
}
