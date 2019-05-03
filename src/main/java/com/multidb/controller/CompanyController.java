package com.multidb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multidb.entity.customer.Customer;
import com.multidb.entity.employee.Employee;
import com.multidb.service.CompanyService;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService customerService;
	
	@PostMapping("/saveCust")
	public ResponseEntity<?> saveCustomer(@RequestBody Customer customer) throws Exception {
		return new ResponseEntity<String>(customerService.saveCustomer(customer), HttpStatus.OK);
	}
	
	@PostMapping("/saveEmp")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) throws Exception {
		return new ResponseEntity<String>(customerService.saveEmployee(employee), HttpStatus.OK);
	}
}
