package com.mindtree.repository;

import java.util.List;

import com.mindtree.model.Customer;

public interface CustomerRepository {

	 List<Customer> findAll();

}