package com.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CustomerRepository;
import com.entity.Customer;

import jakarta.persistence.Query;
@Repository
public class CustomerDao {

	//database code
	@Autowired
	SessionFactory sf;
	
	@Autowired
	CustomerRepository crepository;
	
	public String insertCustomer(Customer customer) {
		Session session=sf.openSession();
		//insert, update,delete ->you need to use transaction
		Transaction tr=	session.beginTransaction();
		session.save(customer);
		tr.commit();
		session.close();
		
		return "Customer Insert SuccessFully";
	}
	
	public List<Customer> getCustomersList(){
		List<Customer> customers=crepository.findAll();
		
//		Session session=sf.openSession();
//	return	session.createQuery("from customer").list();
		
		return customers;
	}
	
	public Customer getCustomerById(Integer id) {
//		get-> it will return null if object not found in db
//		load -> it will return objectNotFound Exception in db
//		Session session=sf.openSession();
//		session.get(Customer, id);
//		session.load(Customer, id);
		
	 Optional<Customer>op=	crepository.findById(id);
	 if(op.isEmpty()) {
		 return null;
	 }
	 else {
		 return op.get();
	 }
	}
	
	
	//update restapi
	public String updateCustomer(Customer customer) {
//		Session session=sf.openSession();
//		Transaction tr=	session.beginTransaction();
//		session.update(customer);
//		tr.commit();
//		session.close();
		
		crepository.save(customer);
		return "update SuccessFully";
	}
	
	public String deleteCustomerById(Integer id) {
		crepository.deleteById(id);
		return "Delete SuccessFully";
	}
	
	public String insertMultipleCustomer(List<Customer> customers) {
		for (Customer customer : customers) {
			crepository.save(customer);
		}
		
		return "Customers Added SuccessFully";
		
		
	}
	
	public List<Customer> getCustomerByFirstName(String firstName){
		Session session=sf.openSession();
												//Customer entity class name lakhavanu
	Query customers=	session.createQuery("from Customer c where c.firstName=:firstName",Customer.class);
	customers.setParameter("firstName", firstName);
List<Customer>list=	((org.hibernate.query.Query<Customer>) customers).list();
	
return list;

		
	}
	
	public List<Customer> getCustomerByLastName(String lastName){
		Session session=sf.openSession();
												//Customer entity class name lakhavanu
	Query customers=	session.createQuery("from Customer c where c.lastName=:lastName",Customer.class);
	customers.setParameter("lastName", lastName);
List<Customer>list=	((org.hibernate.query.Query<Customer>) customers).list();
	
return list;

		
	}
	
	public List<Customer> getCustomerByEmail(String email){
		Session session=sf.openSession();
												//Customer entity class name lakhavanu
	Query customers=	session.createQuery("from Customer c where c.email=:email",Customer.class);
	customers.setParameter("email", email);
List<Customer>list=	((org.hibernate.query.Query<Customer>) customers).list();
	
return list;

		
	}
	public List<Customer> getCustomerByMobile(String mobileNumber){
		Session session=sf.openSession();
												//Customer entity class name lakhavanu
	Query customers=	session.createQuery("from Customer c where c.mobileNumber=:mobileNumber",Customer.class);
	customers.setParameter("mobileNumber", mobileNumber);
List<Customer>list=	((org.hibernate.query.Query<Customer>) customers).list();
	
return list;

		
	}
	public List<Customer> getCustomerByLessThanAge(Integer age){
		Session session=sf.openSession();
		Query customers =session.createQuery("from Customer c where c.age<:age",Customer.class);
		customers.setParameter("age", age);
		List<Customer>list= ((org.hibernate.query.Query<Customer>) customers).list();
		return list;
		
	}
	

	public List<Customer> getCustomerByGreaterThanAge(Integer age){
		Session session=sf.openSession();
		Query customers =session.createQuery("from Customer c where c.age > :age",Customer.class);
		customers.setParameter("age", age);
		List<Customer>list= ((org.hibernate.query.Query<Customer>) customers).list();
		return list;
		
	}
	public List<Customer> getByAge(Integer age){
		Session session=sf.openSession();
		Query customers =session.createQuery("from Customer c where c.age =:age",Customer.class);
		customers.setParameter("age", age);
		List<Customer>list= ((org.hibernate.query.Query<Customer>) customers).list();
		return list;
		
	}
	
	public String updateFirstName(Integer id,String firstName) {
		Session session=sf.openSession();
		Transaction tr=	session.beginTransaction();
		Customer customer=session.get(Customer.class, id);
		customer.setFirstName(firstName);
		tr.commit();
		session.close();
		return "update SuccessFully";
	}
	

	public String updateLastName(Integer id,String lastName) {
		Session session=sf.openSession();
		Transaction tr=	session.beginTransaction();
		Customer customer=session.get(Customer.class, id);
		customer.setLastName(lastName);
		tr.commit();
		session.close();
		return "lastName update SuccessFully";
	}
	
	public String updateEmilId(Integer id,String email) {
		Session session=sf.openSession();
		Transaction tr=	session.beginTransaction();
		Customer customer=session.get(Customer.class, id);
		customer.setEmail(email);
		tr.commit();
		session.close();
		return "Email update SuccessFully";
	}
}
