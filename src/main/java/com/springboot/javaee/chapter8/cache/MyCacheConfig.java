package com.springboot.javaee.chapter8.cache;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: leiyulin
 * @description:
 * @date:2018/9/2下午5:08
 */
@Configuration
@EnableCaching
@EnableAutoConfiguration
@EnableTransactionManagement(proxyTargetClass = true)
@Import(RepositoryRestMvcConfiguration.class)
@EntityScan("com.springboot.javaee.chapter8.cache.**.domain")
@EnableJpaRepositories("com.springboot.javaee.chapter8.cache.**.repository")
@ComponentScan("com.springboot.javaee.chapter8.cache")
public class MyCacheConfig {
}
