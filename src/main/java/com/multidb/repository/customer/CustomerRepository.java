package com.multidb.repository.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.multidb.entity.customer.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
