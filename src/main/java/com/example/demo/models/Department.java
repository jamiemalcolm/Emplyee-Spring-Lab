package com.example.demo.models;

import java.util.ArrayList;

public class Department {

private String name;
private ArrayList<Employee>employees;
private Long id;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }


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
