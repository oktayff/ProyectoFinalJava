package com.proyecto.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.springboot.repository.RestaurantesRepository;
import com.proyecto.springboot.service.RestaurantesService;

@Service
public class RestaurantesServiceImpl implements RestaurantesService {
	
	@Autowired
	RestaurantesRepository restaurantesRepository;

}
