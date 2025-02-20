package com.example.springproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
// Annotations are @Entity, @Id, and @GeneratedValue to map the class to a database table.
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;

    public Employee(Long id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employee() {
    }


}
