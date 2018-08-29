package com.springboot.javaee.chapter8.jpatest;

import com.springboot.javaee.chapter8.jpatest.domain.Person;
import com.springboot.javaee.chapter8.jpatest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("save")
    public Person save(String name, Integer age, String address) {
        Person person = personRepository.save(new Person(name, age, address));
        return person;
    }

    /**
     * findByAddress
     *
     * @param address
     * @return
     */
    @RequestMapping("/findByAddress")
    public List<Person> findByAddress(String address) {
        return personRepository.findByAddress(address);
    }

    @RequestMapping("/findByNameAndAddress")
    public Person findByNameAndAddress(String name, String address) {
        return personRepository.findByNameAndAddress(name, address);
    }

    @RequestMapping("/withNameAndAddressQuery")
    public Person withNameAndAddressQuery(String name, String address) {
        return personRepository.withNameAndAddressQuery(name, address);
    }

    @RequestMapping("/withNameAndAddressNamedQuery")
    public Person withNameAndAddressNamedQuery(String name, String address) {
        return personRepository.withNameAndAddressQuery(name, address);
    }
}
