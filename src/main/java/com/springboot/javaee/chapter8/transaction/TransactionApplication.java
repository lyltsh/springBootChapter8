package com.springboot.javaee.chapter8.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2上午11:29
 */
@SpringBootApplication
@ImportAutoConfiguration(MyTransactionConfig.class)
public class TransactionApplication {
    public static void main(String[] args) {
        SpringApplication.run(TransactionApplication.class, args);
    }
}
