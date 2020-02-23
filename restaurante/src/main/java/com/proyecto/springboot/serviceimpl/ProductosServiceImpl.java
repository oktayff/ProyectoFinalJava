package com.proyecto.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.springboot.repository.ProductosRepository;
import com.proyecto.springboot.service.ProductosService;

@Service
public class ProductosServiceImpl implements ProductosService {
	
	@Autowired
	ProductosRepository productosRepository;

}
