package com.multidb.repository.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.multidb.entity.employee.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
