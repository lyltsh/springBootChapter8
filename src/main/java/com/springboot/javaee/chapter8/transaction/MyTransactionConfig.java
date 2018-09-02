package com.springboot.javaee.chapter8.transaction;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2上午11:30
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement(proxyTargetClass = true)
@Import(RepositoryRestMvcConfiguration.class)
@ComponentScan("com.springboot.javaee.chapter8.transaction")
@EntityScan("com.springboot.javaee.chapter8.transaction.**.domain")
@EnableJpaRepositories("com.springboot.javaee.chapter8.transaction.**.repository")
public class MyTransactionConfig {
}
