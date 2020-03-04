package com.proyecto.springboot.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.springboot.dto.CategoriasDTO;
import com.proyecto.springboot.entities.Categorias;
import com.proyecto.springboot.repository.CategoriasRepository;
import com.proyecto.springboot.service.CategoriasService;

// TODO: Auto-generated Javadoc
/**
 * The Class CategoriasServiceImpl.
 */
@Service
public class CategoriasServiceImpl implements CategoriasService {
	
	/** The categorias repository. */
	@Autowired
	CategoriasRepository categoriasRepository;

	/**
	 * Gets the all categorias.
	 *
	 * @return the all categorias
	 */
	@Override
	public List<CategoriasDTO> getAllCategorias() {
		
		List<Categorias> categoriasBD = categoriasRepository.findAll();
		
		List<CategoriasDTO> categoriasDTO = new ArrayList<CategoriasDTO>();
		
		for(Categorias cat : categoriasBD) {
			categoriasDTO.add(new CategoriasDTO(cat.getCodcat(), cat.getNombre(), cat.getDescripcion()));
		}
		
		return categoriasDTO;
	}
	
}
