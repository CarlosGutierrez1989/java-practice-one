package com.cdsacademy.javapracticeone.bll;

import com.cdsacademy.javapracticeone.dao.PersonRepository;
import com.cdsacademy.javapracticeone.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public Person createPerson(String dni, String name, String surname) {
        return personRepository.save(new Person(dni,name,surname));
    }

    @Override
    public Iterable<Person> lookup() { return personRepository.findAll(); }

    public long total() { return personRepository.count(); }
}
