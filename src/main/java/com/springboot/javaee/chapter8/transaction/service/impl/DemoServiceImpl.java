package com.springboot.javaee.chapter8.transaction.service.impl;

import com.springboot.javaee.chapter8.transaction.domain.Person;
import com.springboot.javaee.chapter8.transaction.repository.PersonRepository;
import com.springboot.javaee.chapter8.transaction.service.DemoServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2上午11:41
 */
@Service
public class DemoServiceImpl implements DemoServiceApi {

    @Autowired
    private PersonRepository personRepository;

    @Override
    @Transactional(rollbackFor = {IllegalArgumentException.class})
    public Person saveWithRollBack(Person person) {
        System.out.println(person);
        Person p = personRepository.save(person);
        if("coupon".equals(person.getName())){
            throw new IllegalArgumentException("coupon exit, rollback");
        }
        return p;
    }

    @Override
    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    public Person saveWithoutRollBack(Person person) {
        System.out.println(person);
        Person p = personRepository.save(person);
        if("coupon".equals(person.getName())){
            throw new IllegalArgumentException("coupon exit, but not rollback");
        }
        return p;
    }
}
