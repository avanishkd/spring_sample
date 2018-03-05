package com.mindtree.service;

import java.util.List;

import com.mindtree.model.Customer;
import com.mindtree.repository.CustomerRepository;
import com.mindtree.repository.HibernateCustomerRepositoryImpl;

/**
 * @author M1030081
 *
 */
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.mindtree.service.CustomerService#findAll()
	 */
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
