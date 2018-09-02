package com.springboot.javaee.chapter8.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2下午6:38
 */
@SpringBootApplication
@ImportAutoConfiguration(MyRedisConfig.class)
public class RedisTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedisTestApplication.class, args);
    }

}
