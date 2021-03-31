package com.optiologic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.optiologic.entity.Employee;
import com.optiologic.service.IEmployeeService;

@CrossOrigin
@RestController
@RequestMapping("api")
public class EmployeeRestController {

	@Autowired
	private IEmployeeService employeeService;

	// Find all Employees
	@GetMapping("employees")
	public List<Employee> findAllEmployees() {
		return employeeService.findAllEmployees();
	}

	// Add employee
	@PostMapping("employees/add")
	public Employee insertEmployee(@RequestBody Employee emp) {
		return employeeService.insertEmployee(emp);
	}

	// Update Employee
	@PutMapping("employees/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployee(emp);
	}

	// Delete employee
	@DeleteMapping("employees/delete/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
}
