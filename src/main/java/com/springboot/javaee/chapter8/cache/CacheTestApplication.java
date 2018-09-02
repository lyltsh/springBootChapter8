package com.springboot.javaee.chapter8.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2下午5:07
 */
@SpringBootApplication
@ImportAutoConfiguration(MyCacheConfig.class)
public class CacheTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(CacheTestApplication.class, args);
    }
}
