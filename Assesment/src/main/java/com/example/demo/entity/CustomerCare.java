package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="customercare_tbl")
public class CustomerCare {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String complaintDescreption; 
	private int userId; 
	private String statusOfComplain;
	
	
	
	public CustomerCare() {
		
	}


	//Parameterized constructor 
	public CustomerCare(int id, String complaintDescreption, int userId, String statusOfComplain) {
		super();
		this.id = id;
		this.complaintDescreption = complaintDescreption;
		this.userId = userId;
		this.statusOfComplain = statusOfComplain;
	}
	

	//Getters and setters 
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getComplaintDescreption() {
		return complaintDescreption;
	}


	public void setComplaintDescreption(String complaintDescreption) {
		this.complaintDescreption = complaintDescreption;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getStatusOfComplain() {
		return statusOfComplain;
	}


	public void setStatusOfComplain(String statusOfComplain) {
		this.statusOfComplain = statusOfComplain;
	} 
	
	
	
	
}
