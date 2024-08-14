package com.capitalone.repository;

/**
 * Author : Nikhil
 */

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitalone.model.Services;

public interface ServicesRepository extends  JpaRepository<Services, Long>{
	
	Services findByName(String name);
	
	void deleteByName(String name);

}
