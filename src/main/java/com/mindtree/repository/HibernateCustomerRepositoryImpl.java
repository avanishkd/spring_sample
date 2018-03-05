package com.mindtree.repository;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.mindtree.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll() {

		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstName("Avanish");
		customer.setLastName("Kumar");
		customers.add(customer);
		return customers;

	} 

}
