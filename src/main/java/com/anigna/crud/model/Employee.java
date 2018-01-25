package com.anigna.crud.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="employee_id")
	private Integer employeeId;

	@Column(name="employee_designation")
	private String employeeDesignation;

	@Column(name="employee_experience")
	private Integer employeeExperience;

	@Column(name="employee_name")
	private String employeeName;

	public Employee() {
	}

	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeDesignation() {
		return this.employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public Integer getEmployeeExperience() {
		return this.employeeExperience;
	}

	public void setEmployeeExperience(Integer employeeExperience) {
		this.employeeExperience = employeeExperience;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeDesignation=" + employeeDesignation
				+ ", employeeExperience=" + employeeExperience + ", employeeName=" + employeeName + "]";
	}

	
}