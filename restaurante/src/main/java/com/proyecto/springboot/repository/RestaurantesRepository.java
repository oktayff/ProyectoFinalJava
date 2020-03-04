package com.proyecto.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.entities.Restaurantes;

// TODO: Auto-generated Javadoc
/**
 * The Interface RestaurantesRepository.
 */
@Repository
public interface RestaurantesRepository extends JpaRepository<Restaurantes, Integer> {
	
	/**
	 * Find by correo.
	 *
	 * @param correo the correo
	 * @return the list
	 */
	public List<Restaurantes> findByCorreo(String correo);
	
	/**
	 * Find by correo and clave.
	 *
	 * @param correo the correo
	 * @param clave the clave
	 * @return the restaurantes
	 */
	public Restaurantes findByCorreoAndClave(String correo, String clave);

}
