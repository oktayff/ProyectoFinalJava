package com.proyecto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.entities.Restaurantes;

@Repository
public interface RestaurantesRepository extends JpaRepository<Restaurantes, Integer> {
	
	

}
