package com.proyecto.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.entities.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer> {

}
