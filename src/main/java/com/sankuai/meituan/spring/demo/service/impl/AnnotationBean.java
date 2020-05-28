package com.sankuai.meituan.spring.demo.service.impl;

import com.sankuai.meituan.spring.demo.service.SpringBean;
import org.springframework.stereotype.Service;

/**
 * 注解类型 Bean
 */
@Service
public class AnnotationBean implements SpringBean {

    @Override
    public String showType() {
        return "由注解定义，如：@Service";
    }
}
