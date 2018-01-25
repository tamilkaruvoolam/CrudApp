package com.anigna.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anigna.crud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}