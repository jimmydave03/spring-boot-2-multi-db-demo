package com.multidb.service;

import com.multidb.entity.customer.Customer;
import com.multidb.entity.employee.Employee;

public interface CompanyService {
	String saveCustomer(Customer customer);

	String saveEmployee(Employee employee);
}
