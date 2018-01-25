package com.anigna.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.anigna.crud.model.Employee;
import com.anigna.crud.service.EmployeeService;


@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
		
	@GetMapping("/")
	public String home(Model model) {
		Optional<List<Employee>> empALL = employeeService.getALL();
		if(empALL.isPresent()) {
			model.addAttribute("empALL", empALL.get());
			return "MainPage";
		}else {
			model.addAttribute("flag", "No Record Found");
			return "MainPage";
		}
	}
	
	@PostMapping("addEmployee")
	public String addEmployee(Model model, Employee emp) {
		model.addAttribute("emp", emp);
		return "AddEmployee";
	}
	
	@PostMapping("editEmployee")
	public String addEmployee(Model model, int employeeId) {
		model.addAttribute("emp", employeeService.getOne(employeeId));
		return "AddEmployee";
	}

	
	@PostMapping("processAddEmployee")
	public String processAddEmployee(Model model, Employee emp) {
		model.addAttribute("info", employeeService.addOne(emp));
		Optional<List<Employee>> empALL = employeeService.getALL();
		model.addAttribute("empALL", empALL.get());
		return "MainPage";
	}
	
	@PostMapping("deleteEmployee")
	public String deleteEmployee(Model model, int employeeId) {
		model.addAttribute("info", employeeService.deleteOne(employeeId));
		Optional<List<Employee>> empALL = employeeService.getALL();
		if(empALL.isPresent()) {
			model.addAttribute("empALL", empALL.get());
			return "MainPage::section";
		}else {
			model.addAttribute("flag", "No Record Found");
			return "MainPage::section";
		}
	}	
}
