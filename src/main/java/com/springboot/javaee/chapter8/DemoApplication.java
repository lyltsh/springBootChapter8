package com.springboot.javaee.chapter8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/8/28下午11:35
 */
@RestController
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @RequestMapping("/index")
    public String index(){
        return "index hello";
    }
}
