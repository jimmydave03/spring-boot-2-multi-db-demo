package com.multidb.service;

import com.multidb.customer.entity.Customer;
import com.multidb.employee.entity.Employee;

public interface CompanyService {
	String saveCustomer(Customer customer);

	String saveEmployee(Employee employee);
}
