package com.heapsteep.repository;

import org.springframework.data.repository.CrudRepository;

import com.heapsteep.model.Person;

public interface MyRepository extends CrudRepository<Person,String>{

}
