package com.javatechie.spring.graphql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatechie.spring.graphql.api.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{

	Person findByEmail(String email);

}
