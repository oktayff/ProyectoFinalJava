package com.proyecto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.entities.Categorias;

// TODO: Auto-generated Javadoc
/**
 * The Interface CategoriasRepository.
 */
@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {

}
