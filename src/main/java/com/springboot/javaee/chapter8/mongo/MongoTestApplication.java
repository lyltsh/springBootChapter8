package com.springboot.javaee.chapter8.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2下午6:14
 */
@SpringBootApplication
@ImportAutoConfiguration(MyMongoConfig.class)
public class MongoTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(MongoTestApplication.class, args);
    }
}
