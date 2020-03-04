package com.proyecto.springboot.serviceimpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.springboot.dto.PedidosProductosDTO;
import com.proyecto.springboot.dto.RestaurantesDTO;
import com.proyecto.springboot.entities.Pedidos;
import com.proyecto.springboot.entities.PedidosProductos;
import com.proyecto.springboot.entities.Productos;
import com.proyecto.springboot.entities.Restaurantes;
import com.proyecto.springboot.repository.PedidosProductosRepository;
import com.proyecto.springboot.repository.PedidosRepository;
import com.proyecto.springboot.repository.ProductosRepository;
import com.proyecto.springboot.service.PedidosProductosService;

// TODO: Auto-generated Javadoc
/**
 * The Class PedidosProductosServiceImpl.
 */
@Service
public class PedidosProductosServiceImpl implements PedidosProductosService {
	
	/** The pedidosproductos repository. */
	@Autowired
	PedidosProductosRepository pedidosproductosRepository;
	
	/** The pedidos repository. */
	@Autowired
	PedidosRepository pedidosRepository;
	
	/** The productos repository. */
	@Autowired
	ProductosRepository productosRepository;
	
	/**
	 * Insertar pedido BD.
	 *
	 * @param resDTO the res DTO
	 * @param carritoPedido the carrito pedido
	 */
	// Método que introducirá el pedido que está en el carrito y que contiene los productos que hemos seleccionado.
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void insertarPedidoBD(RestaurantesDTO resDTO, List<PedidosProductosDTO> carritoPedido) {
		
		Date datePedido = new Date();
		Date fechaPed = new Date(datePedido.getTime());
		Pedidos ped = new Pedidos(0, fechaPed, new Restaurantes(resDTO.getCodres()));
		pedidosRepository.save(ped);
		
		for(PedidosProductosDTO carrito : carritoPedido) {
			
			Optional<Productos> productoBD = productosRepository.findById(carrito.getFkcodprod().getCodprod());
			Productos newProd = new Productos();
			
			if(productoBD.isPresent()) {
				newProd = productoBD.get();
			}
			
			PedidosProductos pedprod = new PedidosProductos(ped, newProd, carrito.getUnidades());
			pedidosproductosRepository.save(pedprod);	
		}	
	}
}
