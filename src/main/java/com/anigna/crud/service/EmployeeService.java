package com.anigna.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anigna.crud.model.Employee;
import com.anigna.crud.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public String addOne(Employee emp) {
		employeeRepository.save(emp);
		return "Employee Data Added Succesfully";
	}
	
	public Employee getOne(int empId) {
		return employeeRepository.findOne(empId);
	}

	public String editOne(Employee emp) {
		employeeRepository.save(emp);
		return "Employee Info Updated Succesfully";
	}

	public String deleteOne(int empId) {
		employeeRepository.delete(empId);
		return "Employee Data Deleted Succesfully";
	}
	
	public Optional<List<Employee>> getALL(){
		if(employeeRepository.count() == 0){
			return Optional.empty();
		}else {
			return Optional.of(employeeRepository.findAll());
		}
	}
}
