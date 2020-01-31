package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Employees;

public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

}
