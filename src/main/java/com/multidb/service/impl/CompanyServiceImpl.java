package com.multidb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multidb.customer.entity.Customer;
import com.multidb.customer.repository.CustomerRepository;
import com.multidb.employee.entity.Employee;
import com.multidb.employee.repository.EmployeeRepository;
import com.multidb.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public String saveCustomer(Customer customer) {
		customerRepository.save(customer);
		return "Done";
	}

	@Override
	public String saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Done";
	}

}
