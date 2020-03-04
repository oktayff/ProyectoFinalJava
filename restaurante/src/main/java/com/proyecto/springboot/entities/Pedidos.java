package com.proyecto.springboot.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * 
 * @author Oktay
 * 
 */

// TODO: Auto-generated Javadoc
/**
 * The Class Pedidos.
 */
@Entity
@Table(name="pedidos")
public class Pedidos implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The codped. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codped;
	
	/** The fecha. */
	@NotNull
	private Date fecha;
	
	/** The enviado. */
	@NotNull
	private int enviado;
	
	/** The fk codres. */
	@ManyToOne
	@JoinColumn(name="fkcodres", referencedColumnName="codres")
	private Restaurantes fkcodres;
	
	/** The pedidosproductos. */
	@OneToMany(mappedBy="fkcodped")
    private Set<PedidosProductos> pedidosproductos;
	
	/**
	 * Instantiates a new pedidos.
	 */
	public Pedidos() {
		super();
	}

	/**
	 * Instantiates a new pedidos.
	 *
	 * @param codped the codped
	 * @param fecha the fecha
	 * @param enviado the enviado
	 * @param fkcodres the fkcodres
	 * @param pedidosproductos the pedidosproductos
	 */
	public Pedidos(int codped, Date fecha, int enviado, Restaurantes fkcodres, Set<PedidosProductos> pedidosproductos) {
		super();
		this.codped = codped;
		this.fecha = fecha;
		this.enviado = enviado;
		this.fkcodres = fkcodres;
		this.pedidosproductos = pedidosproductos;
	}
	
	/**
	 * Instantiates a new pedidos.
	 *
	 * @param enviado the enviado
	 * @param fecha the fecha
	 * @param fkcodres the fkcodres
	 */
	public Pedidos(int enviado, Date fecha, Restaurantes fkcodres) {
		this.enviado = enviado;
		this.fecha = fecha;
		this.fkcodres = fkcodres;
	}
	
	/**
	 * Gets the codped.
	 *
	 * @return the codped
	 */
	public int getCodped() {
		return codped;
	}

	/**
	 * Sets the codped.
	 *
	 * @param codped the new codped
	 */
	public void setCodped(int codped) {
		this.codped = codped;
	}

	/**
	 * Gets the fecha.
	 *
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * Sets the fecha.
	 *
	 * @param fecha the new fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * Gets the enviado.
	 *
	 * @return the enviado
	 */
	public int getEnviado() {
		return enviado;
	}

	/**
	 * Sets the enviado.
	 *
	 * @param enviado the new enviado
	 */
	public void setEnviado(int enviado) {
		this.enviado = enviado;
	}

	/**
	 * Gets the fkcodres.
	 *
	 * @return the fkcodres
	 */
	public Restaurantes getFkcodres() {
		return fkcodres;
	}

	/**
	 * Sets the fkcodres.
	 *
	 * @param fkcodres the new fkcodres
	 */
	public void setFkcodres(Restaurantes fkcodres) {
		this.fkcodres = fkcodres;
	}

	/**
	 * Gets the pedidos productos.
	 *
	 * @return the pedidos productos
	 */
	public Set<PedidosProductos> getPedidosProductos() {
		return pedidosproductos;
	}

	/**
	 * Sets the pedidos productos.
	 *
	 * @param pedidosproductos the new pedidos productos
	 */
	public void setPedidosProductos(Set<PedidosProductos> pedidosproductos) {
		this.pedidosproductos = pedidosproductos;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Pedidos [codped=" + codped + ", fecha=" + fecha + ", enviado=" + enviado + ", fkcodres=" + fkcodres
				+ "]";
	}
	
}
