package com.ljk.spring.demo.service.impl;

import com.ljk.spring.demo.service.BeanTypeService;
import org.springframework.stereotype.Service;

/**
 * 注解类型 Bean
 */
@Service
public class AnnotationImpl implements BeanTypeService {

    @Override
    public String showType() {
        return "AnnotationTypeImpl";
    }
}
