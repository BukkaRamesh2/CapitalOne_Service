package com.capitalone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capitalone.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

	 Account findByCustomerId(long customerId);

	    Account findByName(String name);

	    void deleteByCustomerId(long customerId);

	    void deleteByName(String name);
}
