package com.proyecto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.entities.Pedidos;

/**
 * The Interface PedidosRepository.
 */
@Repository
public interface PedidosRepository extends JpaRepository<Pedidos, Integer> {
	
	
}
