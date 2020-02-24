package com.proyecto.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.proyecto.springboot.repository.CategoriasRepository;
import com.proyecto.springboot.repository.PedidosProductosRepository;
import com.proyecto.springboot.repository.PedidosRepository;
import com.proyecto.springboot.repository.ProductosRepository;
import com.proyecto.springboot.repository.RestaurantesRepository;

@Controller
@RequestMapping("/")
public class RestauranteController {
	
	@Autowired
	RestaurantesRepository restaurantesRepository;
	
	@Autowired
	ProductosRepository productosRepository;
	
	@Autowired
	PedidosRepository pedidosRepository;
	
	@Autowired
	PedidosProductosRepository pedidosProductosRepository;
	
	@Autowired
	CategoriasRepository categoriasRepository;
	
	@RequestMapping(value="")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="listaCategorias")
	public ModelAndView categorias() {
		return new ModelAndView("listaCategorias");
	}
	
	@RequestMapping(value="productos")
	public ModelAndView productos() {
		return new ModelAndView("productos");
	}
	
	@RequestMapping(value="carrito")
	public ModelAndView carrito() {
		return new ModelAndView("carrito");
	}
	

}
