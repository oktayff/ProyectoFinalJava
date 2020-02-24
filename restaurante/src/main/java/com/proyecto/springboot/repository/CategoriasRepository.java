package com.proyecto.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.entities.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {
	
	public List<Categorias> findAll();
	
	public Categorias findByNombre(String nombre);

}
