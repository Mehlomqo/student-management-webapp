package com.example.demo.sms.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	

	public long id ;
	
	
	@Column(name = "first_name",nullable = false)
	
	public  String firstname ;
	@Column(name = "last_name")
	public String lastname ;
	public  String email ;

	
	



	public Student (String firstname, String lastname, String email ) {
		
super();
       
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		
	}
	
	

	public Student() {
		// TODO Auto-generated constructor stub
	}



	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



	public void set(Long id) {
		// TODO Auto-generated method stub
		
	}
}
