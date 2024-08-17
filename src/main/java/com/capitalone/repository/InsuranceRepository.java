package com.capitalone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capitalone.model.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository{
	
	Insurance findByName (String name);
	
	void deleteByName(String name);

}
