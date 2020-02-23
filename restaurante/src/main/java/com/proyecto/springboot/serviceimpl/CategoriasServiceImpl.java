package com.proyecto.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.springboot.repository.CategoriasRepository;
import com.proyecto.springboot.service.CategoriasService;

@Service
public class CategoriasServiceImpl implements CategoriasService {
	
	@Autowired
	CategoriasRepository categoriasRepository;

}
