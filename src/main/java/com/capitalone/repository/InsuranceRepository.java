package com.capitalone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capitalone.model.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Long> {

	Insurance findByPolicyNumber(Integer policyNumber);

	void deleteBypolicyNumber(Integer policyNumber);
	
	Insurance findByBeneficiary(String Beneficiary);
	
	Insurance findByName(String name);

}