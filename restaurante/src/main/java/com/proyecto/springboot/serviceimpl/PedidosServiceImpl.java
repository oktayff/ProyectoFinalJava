package com.proyecto.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.springboot.repository.PedidosRepository;
import com.proyecto.springboot.service.PedidosService;

@Service
public class PedidosServiceImpl implements PedidosService {
	
	@Autowired
	PedidosRepository pedidosRepository;

}
