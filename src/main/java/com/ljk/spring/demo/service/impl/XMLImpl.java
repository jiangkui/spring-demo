package com.ljk.spring.demo.service.impl;

import com.ljk.spring.demo.service.BeanTypeService;

/**
 * XML Bean 类型实现
 */
public class XMLImpl implements BeanTypeService {

    private String name = "XMLTypeImpl";

    @Override
    public String showType() {
        return name;
    }
}
