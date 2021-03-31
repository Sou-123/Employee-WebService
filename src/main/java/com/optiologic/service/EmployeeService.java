package com.optiologic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.optiologic.entity.Employee;
import com.optiologic.repo.IEmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeRepo employeeRepo;

	// Find all Employees
	@Override
	public List<Employee> findAllEmployees() {
		return (List<Employee>) employeeRepo.findAll();
	}

	// Add employee
	@Override
	@Transactional
	public Employee insertEmployee(Employee emp) {

		return employeeRepo.save(emp);
	}

	// Update Employee
	@Override
	@Transactional
	public Employee updateEmployee(Employee emp) {

		return employeeRepo.save(emp);
	}

	// Delete employee
	@Override
	@Transactional
	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
	}
}
