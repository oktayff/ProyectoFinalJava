package com.proyecto.springboot.dto;

// TODO: Auto-generated Javadoc
/**
 * The Class PedidosProductosDTO.
 */
public class PedidosProductosDTO {
	
	/** The codpedprod. */
	private int codpedprod;
	

	/** The unidades. */
	private int unidades;
	

	/** The fkcodped. */
	private PedidosDTO fkcodped;
	

	/** The fkcodprod. */
	private ProductosDTO fkcodprod;
	

	/**
	 * Instantiates a new pedidos productos DTO.
	 */
	public PedidosProductosDTO() {
		super();
	}
	
	
	/**
	 * Instantiates a new pedidos productos DTO.
	 *
	 * @param codpedprod the codpedprod
	 * @param unidades the unidades
	 * @param fkcodped the fkcodped
	 * @param fkcodprod the fkcodprod
	 */
	public PedidosProductosDTO(int codpedprod, int unidades, PedidosDTO fkcodped, ProductosDTO fkcodprod) {
		super();
		this.codpedprod = codpedprod;
		this.unidades = unidades;
		this.fkcodped = fkcodped;
		this.fkcodprod = fkcodprod;
	}
	
	/**
	 * Instantiates a new pedidos productos DTO.
	 *
	 * @param fkcodprod the fkcodprod
	 * @param unidades the unidades
	 */
	public PedidosProductosDTO(ProductosDTO fkcodprod, int unidades) {
		super();
		this.fkcodprod = fkcodprod;
		this.unidades = unidades;
	}

	
	/**
	 * Gets the codpedprod.
	 *
	 * @return the codpedprod
	 */
	public int getCodpedprod() {
		return codpedprod;
	}

	/**
	 * Sets the codpedprod.
	 *
	 * @param codpedprod the new codpedprod
	 */
	public void setCodpedprod(int codpedprod) {
		this.codpedprod = codpedprod;
	}

	/**
	 * Gets the unidades.
	 *
	 * @return the unidades
	 */
	public int getUnidades() {
		return unidades;
	}

	
	/**
	 * Sets the unidades.
	 *
	 * @param unidades the new unidades
	 */
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	
	/**
	 * Gets the fkcodped.
	 *
	 * @return the fkcodped
	 */
	public PedidosDTO getFkcodped() {
		return fkcodped;
	}

	
	/**
	 * Sets the fk codped.
	 *
	 * @param fkcodped the new fk codped
	 */
	public void setFk_codped(PedidosDTO fkcodped) {
		this.fkcodped = fkcodped;
	}

	
	/**
	 * Gets the fkcodprod.
	 *
	 * @return the fkcodprod
	 */
	public ProductosDTO getFkcodprod() {
		return fkcodprod;
	}

	
	/**
	 * Sets the fk codprod.
	 *
	 * @param fkcodprod the new fk codprod
	 */
	public void setFk_codprod(ProductosDTO fkcodprod) {
		this.fkcodprod = fkcodprod;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "PedidosProductosDTO [codpedprod=" + codpedprod + ", unidades=" + unidades + ", fkcodped=" + fkcodped
				+ ", fkcodprod=" + fkcodprod + "]";
	}

}
