package com.ljk.spring.demo.controller;

import com.ljk.spring.demo.service.BeanTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jiangkui
 * @since 1.4.2
 */
@Slf4j
@RestController
public class TestController {

    @Autowired
    private List<BeanTypeService> beanTypeServiceList;

    @RequestMapping("/all")
    public String showAllType() {
        for (BeanTypeService beanTypeService : beanTypeServiceList) {
            String showType = beanTypeService.showType();
            System.out.println("showType = " + showType);
        }
        return "ok";
    }
}
