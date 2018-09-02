package com.springboot.javaee.chapter8.cache.repository;

import com.springboot.javaee.chapter8.cache.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "person")
public interface PersonRepository extends JpaRepository<Person, Long> {

}
