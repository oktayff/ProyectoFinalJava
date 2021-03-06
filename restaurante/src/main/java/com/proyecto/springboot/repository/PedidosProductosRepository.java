package com.proyecto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.entities.PedidosProductos;

/**
 * The Interface PedidosProductosRepository.
 */
@Repository
public interface PedidosProductosRepository extends JpaRepository<PedidosProductos, Integer> {
		
}
