package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Customer;

import com.service.impl.CustomerServiceImpl;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	@Autowired
	CustomerServiceImpl serviceImpl;
	
	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer) {
		
		return serviceImpl.insertCustomer(customer);
	}
	
	@GetMapping("/list")
	public List<Customer> getCustomerList(){
		return serviceImpl.getCustomersList();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable Integer id) {
		return serviceImpl.getCustomerById(id);
	}
	
//	@PutMapping("/")
	@PutMapping("/update")
	public String updateCustomer(@RequestBody Customer customer) {
		return serviceImpl.updateCustomer(customer);
	}
	
//	@DeleteMapping("/{id}")
	@DeleteMapping("/delete/{id}")
	public String deleteCustomerById(@PathVariable("id") Integer id) {
		return serviceImpl.deleteCustomerById(id);
	}
	
	@PostMapping
	public String insertMultipleCustomer(@RequestBody List<Customer> customers) {
		return serviceImpl.insertMultipleCustomer(customers);
	}
	
	@GetMapping("/byname/{name}")
	public List<Customer> getCustomerByFirstName(@PathVariable String name){
		return serviceImpl.getCustomerByFirstName(name);
	}
	
	@GetMapping("/bynamel/{name}")
	public List<Customer> getCustomerByLastName(@PathVariable String name){
		return serviceImpl.getCustomerByLastName(name);
	}
	@GetMapping("/byemail/{email}")
	public List<Customer> getCustomerByEmail(@PathVariable String email){
		return serviceImpl.getCustomerByEmail(email);
	}
	@GetMapping("/bymobile/{mobile}")
	public List<Customer> getCustomerByMobile(@PathVariable String mobile){
		return serviceImpl.getCustomerByMobile(mobile);
	}
	@GetMapping("/lage/{age}")
	public List<Customer> getCustomerByLessThanAge(@PathVariable Integer age){
		return serviceImpl.getCustomerByLessThanAge(age);
	}
	
	@GetMapping("/gage/{age}")
	public List<Customer> getCustomerByGreaterThanAge(@PathVariable Integer age){
		return serviceImpl.getCustomerByGreaterThanAge(age);
	}
	
	@GetMapping("/getByAge/{age}")
	public List<Customer> getByAge(@PathVariable Integer age){
		return serviceImpl.getByAge(age);
	}
	
	@PutMapping("/fname/{id}")
	public String updateFirstName(@PathVariable Integer id, @RequestBody Map<String, String> request) {
				String firstName=request.get("firstName");
				return serviceImpl.updateFirstName(id, firstName);
	}
	
	
	@PutMapping("/lname/{id}")
	public String updateLastName(@PathVariable Integer id, @RequestBody Map<String, String> request) {
				String lastName=request.get("lastName");
				return serviceImpl.updateLastName(id, lastName);
	}
	
	@PutMapping("/email/{id}")
	public String updateEmailId(@PathVariable Integer id, @RequestBody Map<String, String> request) {
				String email=request.get("email");
				return serviceImpl.updateEmilId(id, email);
	}
	
	
	
	
}
