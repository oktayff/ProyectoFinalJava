package com.proyecto.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.entities.Categorias;
import com.proyecto.springboot.entities.Productos;

// TODO: Auto-generated Javadoc
/**
 * The Interface ProductosRepository.
 */
@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {
	
	/**
	 * Find all byfkcodcat.
	 *
	 * @param categoria the categoria
	 * @return the list
	 */
	public List<Productos> findAllByfkcodcat(Categorias categoria);
		
}
