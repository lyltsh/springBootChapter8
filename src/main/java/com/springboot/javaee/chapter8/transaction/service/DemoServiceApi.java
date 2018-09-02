package com.springboot.javaee.chapter8.transaction.service;

import com.springboot.javaee.chapter8.transaction.domain.Person;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2上午11:41
 */
public interface DemoServiceApi {
    public Person saveWithRollBack(Person person);
    public Person saveWithoutRollBack(Person person);
}
