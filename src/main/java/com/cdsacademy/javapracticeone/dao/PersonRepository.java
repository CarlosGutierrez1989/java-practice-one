package com.cdsacademy.javapracticeone.dao;

import com.cdsacademy.javapracticeone.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    Person findByDni(@Param("dni") String dni);
    Person findByNameAndSurname(@Param("alias") String name, @Param("secondName") String surname);
}
