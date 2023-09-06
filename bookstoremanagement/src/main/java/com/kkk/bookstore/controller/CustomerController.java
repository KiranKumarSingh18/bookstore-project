package com.kkk.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkk.bookstore.entity.Customer;
import com.kkk.bookstore.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomers()
	{
		List<Customer> blist = customerService.getAllCustomers();
		if(blist.size() != 0)
			return new ResponseEntity<List<Customer>>(blist,HttpStatus.OK);
		return new ResponseEntity<List<Customer>>(blist,HttpStatus.NOT_FOUND);
	}
	

//	@GetMapping("/{trainId}")
	@GetMapping(value="/{customerId}", produces="application/json")
	public ResponseEntity<Customer> getTrainByTrainId(@PathVariable int customerId)
	{
		Customer a = customerService.getCustomerByCustomerId(customerId);
		if(a!=null)
			return new ResponseEntity<Customer>(a, HttpStatus.OK);
		return new ResponseEntity<Customer>(a,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/", consumes="application/json")
	public HttpStatus insertCustomer(@RequestBody Customer customer)
	{
		customerService.insertOrModifyCustomer(customer);
		return HttpStatus.OK;
	}
	
	@PutMapping(value="/", consumes="application/json")
	public HttpStatus modifyCustomer(@RequestBody Customer customer)
	{
		customerService.insertOrModifyCustomer(customer);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{customerId}")
	public HttpStatus deletecustomer(@PathVariable int customerId)
	{
		if(customerService.deleteCustomerByCustomerId(customerId))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}

	@PostMapping(value="/login",consumes="application/json")
	public boolean countOfValidCustomer(@RequestBody Customer customer) {
		return customerService.countOfCustomer(customer.getEmail(),customer.getPassword());
	}

}
