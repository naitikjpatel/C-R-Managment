package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerDao;
import com.entity.Customer;
import com.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao dao;
	
	@Override
	public String insertCustomer(Customer customer) {
		return dao.insertCustomer(customer);
		
	}

	@Override
	public List<Customer> getCustomersList() {
		
		return dao.getCustomersList();
	}

	@Override
	public Customer getCustomerById(Integer id) {
		
		return dao.getCustomerById(id);
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.updateCustomer(customer);
	}

	@Override
	public String deleteCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return dao.deleteCustomerById(id);
	}

	@Override
	public String insertMultipleCustomer(List<Customer> customers) {
		// TODO Auto-generated method stub
		return dao.insertMultipleCustomer(customers);
	}

	@Override
	public List<Customer> getCustomerByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return dao.getCustomerByFirstName(firstName);
	}

	@Override
	public List<Customer> getCustomerByLessThanAge(Integer age) {
		// TODO Auto-generated method stub
		return dao.getCustomerByLessThanAge(age);
	}

	@Override
	public List<Customer> getCustomerByGreaterThanAge(Integer age) {
		// TODO Auto-generated method stub
		return dao.getCustomerByLessThanAge(age);
	}

	@Override
	public List<Customer> getByAge(Integer age) {
		// TODO Auto-generated method stub
		return dao.getByAge(age);
	}

	@Override
	public List<Customer> getCustomerByLastName(String lastName) {
		// TODO Auto-generated method stub
		return dao.getCustomerByLastName(lastName);
	}

	@Override
	public List<Customer> getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return dao.getCustomerByEmail(email);
	}

	@Override
	public List<Customer> getCustomerByMobile(String mobileNumber) {
		// TODO Auto-generated method stub
		return dao.getCustomerByMobile(mobileNumber);
	}

	@Override
	public String updateFirstName(Integer id, String firstName) {
		// TODO Auto-generated method stub
		return dao.updateFirstName(id, firstName);
	}

	@Override
	public String updateLastName(Integer id, String lastName) {
		// TODO Auto-generated method stub
		return dao.updateLastName(id, lastName);
	}

	@Override
	public String updateEmilId(Integer id, String email) {
		// TODO Auto-generated method stub
		return dao.updateEmilId(id, email);
	}

	
}
