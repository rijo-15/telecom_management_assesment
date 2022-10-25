package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Plans;
import com.example.demo.repo.PlansRepo;

@RestController

@RequestMapping("/api/plans")
public class PlansController {
	
	@Autowired
	PlansRepo plansRepo; 
	
	@GetMapping("/getplans")
	private List<Plans> getAllPlans(){
		return plansRepo.findAll();
	}
	
	@PostMapping("/addplans")
	Plans newPlans(@RequestBody Plans plans) {
		
		return plansRepo.save(plans); 
	}
	
	@DeleteMapping("/deleteplans/{id}")
	String deletePlans(@PathVariable("id") int id) {
		try {
			plansRepo.deleteById(id);
			return "Record delete successfully"; 
		}catch(Exception e) {
			e.printStackTrace();
			return "Deletion unsuccessful"; 
		}
	}
	

}
