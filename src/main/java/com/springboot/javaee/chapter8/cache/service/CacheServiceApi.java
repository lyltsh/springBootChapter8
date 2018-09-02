package com.springboot.javaee.chapter8.cache.service;

import com.springboot.javaee.chapter8.cache.domain.Person;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2下午5:14
 */
public interface CacheServiceApi {
    public Person save(Person person);
    public void remove(Long id);
    public Person findOne(Person person);
}
