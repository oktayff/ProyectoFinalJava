package com.proyecto.springboot.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * 
 * @author Oktay
 * 
 */

// TODO: Auto-generated Javadoc
/**
 * The Class PedidosProductos.
 */
@Entity
@Table(name="pedidosproductos")
public class PedidosProductos implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The codpedprod. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codpedprod;
	
	/** The unidades. */
	@NotNull
	private int unidades;
	
	/** The fk codped. */
	@ManyToOne
	@JoinColumn(name="codped", referencedColumnName="codped")
	private Pedidos fkcodped;
	
	/** The fk codprod. */
	@ManyToOne
	@JoinColumn(name="codprod", referencedColumnName="codprod")
	private Productos fkcodprod;
	
	/**
	 * Instantiates a new pedidos productos.
	 */
	public PedidosProductos() {
		super();
	}

	/**
	 * Instantiates a new pedidos productos.
	 *
	 * @param codpedprod the codpedprod
	 * @param unidades the unidades
	 * @param fkcodped the fkcodped
	 * @param fkcodprod the fkcodprod
	 */
	public PedidosProductos(int codpedprod, int unidades, Pedidos fkcodped, Productos fkcodprod) {
		super();
		this.codpedprod = codpedprod;
		this.unidades = unidades;
		this.fkcodped = fkcodped;
		this.fkcodprod = fkcodprod;
	}
	
	
	/**
	 * Instantiates a new pedidos productos.
	 *
	 * @param ped the ped
	 * @param newProd the new prod
	 * @param unidades the unidades
	 */
	public PedidosProductos(Pedidos ped, Productos newProd, int unidades) {
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
	public Pedidos getFkcodped() {
		return fkcodped;
	}



	/**
	 * Sets the fkcodped.
	 *
	 * @param fkcodped the new fkcodped
	 */
	public void setFkcodped(Pedidos fkcodped) {
		this.fkcodped = fkcodped;
	}



	/**
	 * Gets the fkcodprod.
	 *
	 * @return the fkcodprod
	 */
	public Productos getFkcodprod() {
		return fkcodprod;
	}



	/**
	 * Sets the fkcodprod.
	 *
	 * @param fkcodprod the new fkcodprod
	 */
	public void setFkcodprod(Productos fkcodprod) {
		this.fkcodprod = fkcodprod;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "PedidosProductos [codpedprod=" + codpedprod + ", unidades=" + unidades + ", fkcodped=" + fkcodped
				+ ", fkcodprod=" + fkcodprod + "]";
	}
	
}
