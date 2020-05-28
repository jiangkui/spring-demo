package com.sankuai.meituan.spring.demo.service.impl;

import com.sankuai.meituan.spring.demo.service.SpringBean;

/**
 * XML Bean 类型实现
 */
public class XMLBean implements SpringBean {

    @Override
    public String showType() {
        return "在 XML 内定义";
    }
}
