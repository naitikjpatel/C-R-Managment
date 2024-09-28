package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Customer;
@Repository
public class CustomerDao {

	//database code
	@Autowired
	SessionFactory sf;
	
	public String insertCustomer(Customer customer) {
		Session session=sf.openSession();
		//insert, update,delete ->you need to use transaction
		Transaction tr=	session.beginTransaction();
		session.save(customer);
		tr.commit();
		session.close();
		
		return "Customer Insert SuccessFully";
	}
}
