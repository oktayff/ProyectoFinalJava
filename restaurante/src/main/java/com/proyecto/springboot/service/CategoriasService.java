package com.proyecto.springboot.service;

import java.util.List;

import com.proyecto.springboot.dto.CategoriasDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface CategoriasService.
 */
public interface CategoriasService {
	
	/**
	 * Gets the all categorias.
	 *
	 * @return the all categorias
	 */
	public List<CategoriasDTO> getAllCategorias();

}
