package com.kkk.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kkk.bookstore.Repository.CustomerRepo;
import com.kkk.bookstore.entity.Customer;
@Service
public class CustomerService {
	@Autowired
	private CustomerRepo customerRepo;

	@Transactional(readOnly=true)
	public List<Customer> getAllCustomers()
	{
		return customerRepo.findAll();
	}
	
	@Transactional(readOnly=true)
	public Customer getCustomerByCustomerId(int customerId)
	{
		Optional<Customer> ot = customerRepo.findById(customerId);
		if(ot.isPresent())
			return ot.get();
		return new Customer();
	}
	
	@Transactional
	public boolean insertOrModifyCustomer(Customer customer)
	{
		if(customerRepo.save(customer) == null)
			return false;
			return true;
	}
	
	@Transactional
	public boolean deleteCustomerByCustomerId(int customerId)
	{
		long count = customerRepo.count();
		customerRepo.deleteById(customerId);
		if(count > customerRepo.count())
			return true;
		return false;
	}

	@Transactional
	public boolean countOfCustomer(String email,String password) {
		return customerRepo.validateLogin(email, password);
		
	}
	
}
