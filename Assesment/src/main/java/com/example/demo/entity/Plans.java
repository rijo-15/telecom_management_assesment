package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plans_tbl")
public class Plans {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	private String planName; 
	
	private double cost; 
	
	private String validity;
	
	
	//Default constructor 
	public Plans() {
		
	}

	//Parameterized constructor 
	public Plans(int id, String planName, double cost, String validity) {
		super();
		this.id = id;
		this.planName = planName;
		this.cost = cost;
		this.validity = validity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	} 
	

}
