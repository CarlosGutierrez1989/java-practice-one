package com.cdsacademy.javapracticeone.bll;


import com.cdsacademy.javapracticeone.model.Person;


public interface PersonService {

    public Person createPerson(String dni, String name, String surname);

    public Iterable<Person> lookup();

    public long total();
}
