package com.prueba.adn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.adn.entity.ADN;

public interface AdnRepository extends JpaRepository<ADN, Long>{

	
}
