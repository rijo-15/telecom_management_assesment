package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomerCare;

@Repository
public interface CustomerCareRepo extends JpaRepository<CustomerCare, Integer>{
	

}
