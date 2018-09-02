package com.springboot.javaee.chapter8.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/1上午11:26
 */
@SpringBootConfiguration
@ImportAutoConfiguration(MyRestMvcConfiguration.class)
public class RestTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestTestApplication.class, args);
    }
}
