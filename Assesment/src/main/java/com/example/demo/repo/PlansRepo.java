package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Plans;

@Repository
public interface PlansRepo extends JpaRepository<Plans, Integer> {
	
	
}
