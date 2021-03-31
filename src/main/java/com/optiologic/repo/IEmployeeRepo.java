package com.optiologic.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.optiologic.entity.Employee;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee, Integer> {

}
