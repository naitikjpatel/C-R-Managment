package com.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity  //this anotation is use for the make the table in the database
@Table(name="Customers")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {

		@Id
		@GeneratedValue(strategy =  GenerationType.IDENTITY)
		Integer id;
		
//		@Column(name="first_name" ) using this we can change the name of the column in the database
		String firstName;
		String lastName;
		String email;
		String mobileNumber;
		Integer age;
}
