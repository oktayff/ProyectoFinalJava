package com.proyecto.springboot.service;

import java.util.List;

import com.proyecto.springboot.dto.CategoriasDTO;
import com.proyecto.springboot.dto.ProductosDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface ProductosService.
 */
public interface ProductosService {
	
	/**
	 * Gets the all productos by categoria.
	 *
	 * @param categoriasDTO the categorias DTO
	 * @return the all productos by categoria
	 */
	public List<ProductosDTO> getAllProductosByCategoria(CategoriasDTO categoriasDTO);

}
