package com.springboot.javaee.chapter8.cache.service.impl;

import com.springboot.javaee.chapter8.cache.domain.Person;
import com.springboot.javaee.chapter8.cache.repository.PersonRepository;
import com.springboot.javaee.chapter8.cache.service.CacheServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2下午5:15
 */
@Service
public class CacheServiceImpl implements CacheServiceApi {
    private static final String CACHE_VALUE_NAME = "people";
    @Autowired
    private PersonRepository personRepository;

    @Override
    @CachePut(value = CACHE_VALUE_NAME, key = "#person.id")
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("为id、key:" + p.getId() + "做了缓存" + "\n" + p);
        return p;
    }

    @Override
    @CacheEvict(value = CACHE_VALUE_NAME)
    public void remove(Long id) {
        System.out.println("删除了id、key:" + id + "的数据缓存");
        personRepository.deleteById(id);
    }

    @Override
    @Cacheable(value = CACHE_VALUE_NAME, key = "#person.id")
    public Person findOne(Person person) {
        Person p = personRepository.getOne(person.getId());
        System.out.println("为id、key:" + p.getId() + "做了缓存" + "\n" + p);
        return p;
    }
}
