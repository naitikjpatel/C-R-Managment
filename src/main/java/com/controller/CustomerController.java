package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Customer;

import com.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	@Autowired
	CustomerServiceImpl serviceImpl;
	
	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer) {
		
		return serviceImpl.insertCustomer(customer);
	}
	
}
