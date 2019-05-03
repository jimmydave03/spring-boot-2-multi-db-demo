package com.multidb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multidb.entity.customer.Customer;
import com.multidb.entity.employee.Employee;
import com.multidb.repository.customer.CustomerRepository;
import com.multidb.repository.employee.EmployeeRepository;
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
