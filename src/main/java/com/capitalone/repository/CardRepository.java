package com.capitalone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capitalone.model.Card;

public interface CardRepository extends JpaRepository<Card, Long>{

}
