package com.proyecto.springboot.dto;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class CarritoDTO.
 */
public class CarritoDTO {
	
	/** The carrito compra. */
	private ArrayList<PedidosProductosDTO> carritoCompra;
	
	/**
	 * Instantiates a new carrito DTO.
	 */
	public CarritoDTO() {
		carritoCompra = new ArrayList<PedidosProductosDTO>();
	}
	
	/**
	 * Mostrar carrito.
	 *
	 * @return the array list
	 */
	// Método para obtener todos los items del carrito
	public ArrayList<PedidosProductosDTO> mostrarCarrito() {
		return carritoCompra;
	}
	
	/**
	 * Anadir producto.
	 *
	 * @param producto the producto
	 * @param unidades the unidades
	 */
	// Método para añadir una o varias unidades del mismo producto
	public void anadirProducto(ProductosDTO producto, int unidades) {
		PedidosProductosDTO pedidoproducto = new PedidosProductosDTO(producto, unidades);
		PedidosProductosDTO pedidoproductoE = this.pedprodEncontrado(pedidoproducto);
		
		if(carritoCompra.size() == 0) {
			carritoCompra.add(pedidoproducto);
		}else {
			if(pedidoproductoE != null) {
				int cantidad = pedidoproductoE.getUnidades();
				int newCantidad = pedidoproducto.getUnidades();
				carritoCompra.remove(pedidoproductoE);
				pedidoproducto.setUnidades(cantidad + newCantidad);
				carritoCompra.add(pedidoproducto);
			} else {
				carritoCompra.add(pedidoproducto);
			}
			
		}
		this.existeProducto(pedidoproducto);
	}
	
	/**
	 * Eliminar producto.
	 *
	 * @param producto the producto
	 * @param unidades the unidades
	 */
	// Elimina un producto
	public void eliminarProducto(ProductosDTO producto, int unidades) {
		PedidosProductosDTO pedidoproducto = new PedidosProductosDTO(producto, unidades);
		PedidosProductosDTO pedidoproductoE = this.pedprodEncontrado(pedidoproducto);
		
		if(pedidoproductoE != null) {
			int cantidad = pedidoproductoE.getUnidades();
			int newCantidad = pedidoproducto.getUnidades();
			carritoCompra.remove(pedidoproductoE);
			pedidoproducto.setUnidades(cantidad - newCantidad);
			carritoCompra.add(pedidoproducto);
		}
		this.existeProducto(pedidoproducto);
	}
	
	/**
	 * Vaciar carrito compra.
	 */
	// Método que vacia el carrito
	public void vaciarCarritoCompra(){
		carritoCompra.clear();
	}
	
	/**
	 * Obtener carrito compra.
	 *
	 * @return the array list
	 */
	// Devuelve el contenido del carrito.
	public ArrayList<PedidosProductosDTO> obtenerCarritoCompra(){
		return carritoCompra;
	}
	
	/**
	 * Pedprod encontrado.
	 *
	 * @param pedidoproducto the pedidoproducto
	 * @return the pedidos productos DTO
	 */
	// Método que obtiene un pedidoproducto en específico.
	private PedidosProductosDTO pedprodEncontrado(PedidosProductosDTO pedidoproducto) {
		int codigoproducto = pedidoproducto.getFkcodprod().getCodprod();
		for(PedidosProductosDTO carritoPedProd : carritoCompra) {
			if (carritoPedProd.getFkcodprod().getCodprod() == codigoproducto) {
				return carritoPedProd;
			}
		}
		return null;
	}
	
	/**
	 * Existe producto.
	 *
	 * @param pedidoproducto the pedidoproducto
	 */
	// Método que comprueba si existe el producto.
	private void existeProducto(PedidosProductosDTO pedidoproducto){
		if (pedidoproducto.getUnidades() <= 0 ) {
			carritoCompra.remove(pedidoproducto);
		}
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "CarritoDTO [carritoCompra=" + carritoCompra + "]";
	}
	
}
