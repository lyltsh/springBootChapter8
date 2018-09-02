package com.springboot.javaee.chapter8.cache.cachecontroller;

import com.springboot.javaee.chapter8.cache.domain.Person;
import com.springboot.javaee.chapter8.cache.service.impl.CacheServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2下午5:25
 */
@RestController
public class CacheController {
    @Autowired
    private CacheServiceImpl cacheService;

    @RequestMapping("/put")
    @ResponseBody
    public Person put(Person person) {
        return cacheService.save(person);
    }

    @RequestMapping("/able")
    @ResponseBody
    public Person cacheable(Person person) {
        return cacheService.findOne(person);
    }

    @RequestMapping("/evit")
    public String evit(Long id) {
        cacheService.remove(id);
        return "ok";
    }
}
