package com.capitalone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitalone.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
