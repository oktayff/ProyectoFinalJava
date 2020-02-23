package com.proyecto.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.springboot.repository.PedidosProductosRepository;
import com.proyecto.springboot.service.PedidosProductosService;

@Service
public class PedidosProductosServiceImpl implements PedidosProductosService {
	
	@Autowired
	PedidosProductosRepository pedidosproductosRepository;

}
