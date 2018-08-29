package com.springboot.javaee.chapter8.jpatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ImportAutoConfiguration(JpaConfiguration.class)
public class JpaTestApplication {
    public static void main(String[] args){
        SpringApplication.run(JpaTestApplication.class, args);
    }
}
