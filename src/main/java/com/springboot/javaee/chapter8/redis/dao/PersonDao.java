package com.springboot.javaee.chapter8.redis.dao;

import com.springboot.javaee.chapter8.redis.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2下午9:58
 */
@Repository
public class PersonDao {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource(name = "stringRedisTemplate")
    private ValueOperations<String, String> valueOpsStr;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Resource(name = "redisTemplate")
    private ValueOperations<Object, Object> valueOps;


    public void stringRedisTemplateDemo() {
        valueOpsStr.set("xx", "yy");
    }

    public void save(Person person) {
        valueOps.set(person.getId(), person);
    }

    public String getString() {
        return valueOpsStr.get("xx");
    }

    public Person getPerson() {
        return (Person) valueOps.get("1");
    }
}
