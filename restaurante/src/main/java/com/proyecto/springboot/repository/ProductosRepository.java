package com.proyecto.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.entities.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {
	
	public List<Productos> findAll();
	
	public Productos findByNombre(String nombre);
	
	public void addProducto(String nombre);
	
	public void deleteByNombre(String nombre);

}
