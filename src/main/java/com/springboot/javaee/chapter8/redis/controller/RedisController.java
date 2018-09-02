package com.springboot.javaee.chapter8.redis.controller;

import com.springboot.javaee.chapter8.redis.dao.PersonDao;
import com.springboot.javaee.chapter8.redis.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2下午10:09
 */
@RestController
public class RedisController {
    @Autowired
    private PersonDao personDao;

    @RequestMapping("/set")
    public void set() {
        Person person = new Person("1", 32, "ll");
        person.setId(1L);
        System.out.println(person);
        personDao.save(person);
        personDao.stringRedisTemplateDemo();
    }

    @RequestMapping("/getStr")
    public String getStr() {
        return personDao.getString();
    }

    @RequestMapping("/getPerson")
    public Person getPerson() {
        return personDao.getPerson();
    }
}
