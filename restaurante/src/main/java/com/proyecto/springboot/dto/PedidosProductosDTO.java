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
	
	/** The fk codped. */
	private int fk_codped;
	
	/** The fk codprod. */
	private int fk_codprod;
	
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
	 * @param fk_codped the fk codped
	 * @param fk_codprod the fk codprod
	 */
	public PedidosProductosDTO(int codpedprod, int unidades, int fk_codped, int fk_codprod) {
		super();
		this.codpedprod = codpedprod;
		this.unidades = unidades;
		this.fk_codped = fk_codped;
		this.fk_codprod = fk_codprod;
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
	 * Gets the fk codped.
	 *
	 * @return the fk codped
	 */
	public int getFk_codped() {
		return fk_codped;
	}

	/**
	 * Sets the fk codped.
	 *
	 * @param fk_codped the new fk codped
	 */
	public void setFk_codped(int fk_codped) {
		this.fk_codped = fk_codped;
	}

	/**
	 * Gets the fk codprod.
	 *
	 * @return the fk codprod
	 */
	public int getFk_codprod() {
		return fk_codprod;
	}

	/**
	 * Sets the fk codprod.
	 *
	 * @param fk_codprod the new fk codprod
	 */
	public void setFk_codprod(int fk_codprod) {
		this.fk_codprod = fk_codprod;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "PedidosProductosDTO [codpedprod=" + codpedprod + ", unidades=" + unidades + ", fk_codped=" + fk_codped
				+ ", fk_codprod=" + fk_codprod + "]";
	}

}
