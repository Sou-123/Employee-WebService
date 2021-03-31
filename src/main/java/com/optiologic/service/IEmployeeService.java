package com.optiologic.service;

import java.util.List;


import com.optiologic.entity.Employee;

public interface IEmployeeService {

	// Find all Employees
	List<Employee> findAllEmployees();

	// Add employee
	Employee insertEmployee(Employee emp);

	// Update Employee
	Employee updateEmployee(Employee emp);

	// Delete employee
	void deleteEmployee(int id);

}