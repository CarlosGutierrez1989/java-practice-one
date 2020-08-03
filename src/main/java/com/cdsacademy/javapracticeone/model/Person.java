package com.cdsacademy.javapracticeone.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="persons")
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

    protected Person(){
    }
    public Person(String dni, String name, String surname){
        this.dni = dni;
        this.name = name;
        this.surname = surname;
    }

}
