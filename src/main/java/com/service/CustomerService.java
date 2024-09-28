package com.service;

import java.util.List;

import com.entity.Customer;

public interface CustomerService {

	String insertCustomer(Customer customer);
	List<Customer> getCustomersList();
	Customer getCustomerById(Integer id);
	String updateCustomer(Customer customer);
	String deleteCustomerById(Integer id);
	String insertMultipleCustomer(List<Customer> customers);
	List<Customer> getCustomerByFirstName(String firstName);
	List<Customer> getCustomerByLessThanAge(Integer age);
	List<Customer> getCustomerByGreaterThanAge(Integer age);
	List<Customer> getByAge(Integer age);
	List<Customer> getCustomerByLastName(String lastName);
	List<Customer> getCustomerByEmail(String email);
	List<Customer> getCustomerByMobile(String mobileNumber);
	String updateFirstName(Integer id,String firstName);
	String updateLastName(Integer id,String lastName);
	String updateEmilId(Integer id,String email);
	String updateMobileNumber(Integer id ,String mobileNumber);
	List<String> getAllFirstName();
}
