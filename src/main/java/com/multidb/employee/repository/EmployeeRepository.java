package com.multidb.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.multidb.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
