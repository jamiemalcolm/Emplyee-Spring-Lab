package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "departments")
public class Department {


@Column(name = "name")
private String name;

@JsonIgnoreProperties({"department"})
@OneToMany(mappedBy = "department")
private ArrayList<Employee>employees;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public Department(){}

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
