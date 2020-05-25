package com.ljk.spring.demo.service;

/**
 * 在 @Configuration 中配置的实现
 */
public class ConfigurationTypeImpl implements BeanImplTypeService {

    @Override
    public String showType() {
        return "ConfigurationTypeImpl";
    }
}
