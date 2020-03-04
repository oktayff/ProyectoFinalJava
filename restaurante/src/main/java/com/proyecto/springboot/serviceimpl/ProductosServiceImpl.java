package com.proyecto.springboot.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.springboot.dto.CategoriasDTO;
import com.proyecto.springboot.dto.ProductosDTO;
import com.proyecto.springboot.entities.Categorias;
import com.proyecto.springboot.entities.Productos;
import com.proyecto.springboot.repository.ProductosRepository;
import com.proyecto.springboot.service.ProductosService;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductosServiceImpl.
 */
@Service
public class ProductosServiceImpl implements ProductosService {
	
	/** The productos repository. */
	@Autowired
	ProductosRepository productosRepository;

	/**
	 * Gets the all productos by categoria.
	 *
	 * @param categoriasDTO the categorias DTO
	 * @return the all productos by categoria
	 */
	@Override
	public List<ProductosDTO> getAllProductosByCategoria(CategoriasDTO categoriasDTO) {
		
		Categorias cate = new Categorias(categoriasDTO.getCodcat(), categoriasDTO.getNombre(), categoriasDTO.getDescripcion());
		
		List<Productos> productosBD = productosRepository.findAllByfkcodcat(cate);
		
		List<ProductosDTO> productosDTO = new ArrayList<ProductosDTO>();
		
		for(Productos prod : productosBD) {
			productosDTO.add(new ProductosDTO(prod.getCodprod(), prod.getNombre(), prod.getDescripcion(), prod.getPeso(), prod.getStock()));
		}
		
		return productosDTO;
	}

}
