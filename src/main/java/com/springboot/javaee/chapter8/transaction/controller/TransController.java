package com.springboot.javaee.chapter8.transaction.controller;

import com.springboot.javaee.chapter8.transaction.domain.Person;
import com.springboot.javaee.chapter8.transaction.service.impl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2上午11:48
 */
@RestController
public class TransController {
    @Autowired
    private DemoServiceImpl demoService;

    @RequestMapping("/rollback")
    public Person rollback(Person person){
        return demoService.saveWithRollBack(person);
    }

    @RequestMapping("/noRollback")
    public Person noRollback(Person person){
        return demoService.saveWithoutRollBack(person);
    }
}
