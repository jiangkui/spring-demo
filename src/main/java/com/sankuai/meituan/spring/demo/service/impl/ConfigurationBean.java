package com.sankuai.meituan.spring.demo.service.impl;

import com.sankuai.meituan.spring.demo.service.SpringBean;

/**
 * 在 @Configuration 中配置的实现
 */
public class ConfigurationBean implements SpringBean {

    @Override
    public String showType() {
        return "在 @Configuration 中定义";
    }
}
