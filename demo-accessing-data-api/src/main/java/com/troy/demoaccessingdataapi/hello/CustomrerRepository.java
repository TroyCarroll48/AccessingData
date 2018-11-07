package com.troy.demoaccessingdataapi.hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomrerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

}
