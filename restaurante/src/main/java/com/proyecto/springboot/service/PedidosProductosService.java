package com.proyecto.springboot.service;

import java.util.List;

import com.proyecto.springboot.dto.PedidosProductosDTO;
import com.proyecto.springboot.dto.RestaurantesDTO;

// TODO: Auto-generated Javadoc
/**
 * The Interface PedidosProductosService.
 */
public interface PedidosProductosService {
	
	/**
	 * Insertar pedido BD.
	 *
	 * @param resDTO the res DTO
	 * @param carritoPedido the carrito pedido
	 */
	public void insertarPedidoBD(RestaurantesDTO resDTO, List<PedidosProductosDTO> carritoPedido);

}
