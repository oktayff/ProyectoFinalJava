package com.proyecto.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.entities.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String> {
	
	/**
	 * Find by username.
	 *
	 * @param username the username
	 * @return the usuario
	 */
	Usuario findByUsername(String username);

}
