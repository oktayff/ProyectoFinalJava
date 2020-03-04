package com.proyecto.springboot.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.springboot.dto.RestaurantesDTO;
import com.proyecto.springboot.entities.Restaurantes;
import com.proyecto.springboot.repository.RestaurantesRepository;
import com.proyecto.springboot.service.RestaurantesService;

// TODO: Auto-generated Javadoc
/**
 * The Class RestaurantesServiceImpl.
 */
@Service
public class RestaurantesServiceImpl implements RestaurantesService {
	
	/** The restaurantes repository. */
	@Autowired
	RestaurantesRepository restaurantesRepository;

	/**
	 * Obtener usuario.
	 *
	 * @param resDTO the res DTO
	 * @return the restaurantes DTO
	 */
	@Override
	public RestaurantesDTO obtenerUsuario(RestaurantesDTO resDTO) {
		
		Restaurantes rest = new Restaurantes(resDTO.getCorreo(), resDTO.getClave());
		
		Restaurantes resRecibido = restaurantesRepository.findByCorreoAndClave(rest.getCorreo(), rest.getClave());
		
		if(resRecibido != null) {
			return new RestaurantesDTO(resRecibido.getCodres(), resRecibido.getCorreo(), resRecibido.getClave(), resRecibido.getPais(), resRecibido.getCp(), resRecibido.getCiudad(), resRecibido.getDireccion()); 
		}
		return null;
	}
	
	

}
