package com.ljk.spring.demo.controller;

import com.ljk.spring.demo.service.BeanImplTypeService;
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
    private List<BeanImplTypeService> beanImplTypeServiceList;

    @RequestMapping("/all")
    public void showAllType() {
        for (BeanImplTypeService beanImplTypeService : beanImplTypeServiceList) {
            String showType = beanImplTypeService.showType();
            System.out.println("showType = " + showType);
        }
    }
}
