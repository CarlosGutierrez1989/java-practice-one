package com.cdsacademy.javapracticeone.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Getter
@Setter
public class Person implements Serializable{
    @Id
    @GeneratedValue
    @Column
    private Integer id;
    @Column(length = 10, unique = true)
    private String dni;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String surname2;

    protected Person(){
    }
    public Person(String dni, String name, String surname){
        this.dni = dni;
        this.name = name;
        this.surname = surname;
    }

}
