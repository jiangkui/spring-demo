package com.ljk.spring.demo.service;

import org.springframework.stereotype.Service;

/**
 * 注解类型 Bean
 */
@Service
public class AnnotationTypeImpl implements BeanImplTypeService {

    @Override
    public String showType() {
        return "AnnotationTypeImpl";
    }
}
