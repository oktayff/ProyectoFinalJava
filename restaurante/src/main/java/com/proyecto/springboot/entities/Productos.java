package com.proyecto.springboot.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.sun.istack.NotNull;

/**
 * 
 * @author Oktay
 * 
 */

// TODO: Auto-generated Javadoc
/**
 * The Class Productos.
 */
@Entity
@Table(name="productos")
public class Productos implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The codprod. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codprod;
	
	/** The nombre. */
	@NotNull
	@Column(length=45)
	private String nombre;
	
	/** The descripcion. */
	@NotNull
	@Column(length=90)
	private String descripcion;
	
	/** The peso. */
	@NotNull
	private int peso;
	
	/** The stock. */
	@NotNull
	private int stock;
	
	/** The fkcodcat. */
	@Cascade(CascadeType.MERGE)
	@ManyToOne
	@JoinColumn(name="fkcodcat", referencedColumnName="codcat")
	private Categorias fkcodcat;
	
	/** The pedidosproductos. */
	@OneToMany(mappedBy="fkcodprod")
	private Set<PedidosProductos> pedidosproductos; 
	
	/**
	 * Instantiates a new productos.
	 */
	public Productos() {
		super();
	}

	/**
	 * Instantiates a new productos.
	 *
	 * @param codprod the codprod
	 * @param nombre the nombre
	 * @param descripcion the descripcion
	 * @param peso the peso
	 * @param stock the stock
	 * @param fkcodcat the fkcodcat
	 * @param pedidosproductos the pedidosproductos
	 */
	public Productos(int codprod, String nombre, String descripcion, int peso, int stock, Categorias fkcodcat,
			Set<PedidosProductos> pedidosproductos) {
		super();
		this.codprod = codprod;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
		this.stock = stock;
		this.fkcodcat = fkcodcat;
		this.pedidosproductos = pedidosproductos;
	}
	
	/**
	 * Instantiates a new productos.
	 *
	 * @param codprod the codprod
	 * @param nombre the nombre
	 * @param descripcion the descripcion
	 * @param peso the peso
	 * @param stock the stock
	 */
	public Productos(int codprod, String nombre, String descripcion, int peso, int stock) {
		super();
		this.codprod = codprod;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
		this.stock = stock;

	}
	
	/**
	 * Instantiates a new productos.
	 *
	 * @param nombre the nombre
	 * @param descripcion the descripcion
	 * @param peso the peso
	 * @param stock the stock
	 * @param fkcodcat the fkcodcat
	 */
	public Productos(String nombre, String descripcion, int peso, int stock, Categorias fkcodcat) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
		this.stock = stock;
		this.fkcodcat = fkcodcat;

	}
	

	/**
	 * Gets the codprod.
	 *
	 * @return the codprod
	 */
	public int getCodprod() {
		return codprod;
	}

	/**
	 * Sets the codprod.
	 *
	 * @param codprod the new codprod
	 */
	public void setCodprod(int codprod) {
		this.codprod = codprod;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Gets the peso.
	 *
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Sets the peso.
	 *
	 * @param peso the new peso
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * Gets the stock.
	 *
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Sets the stock.
	 *
	 * @param stock the new stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * Gets the fkcodcat.
	 *
	 * @return the fkcodcat
	 */
	public Categorias getFkcodcat() {
		return fkcodcat;
	}

	/**
	 * Sets the fkcodcat.
	 *
	 * @param fkcodcat the new fkcodcat
	 */
	public void setFkcodcat(Categorias fkcodcat) {
		this.fkcodcat = fkcodcat;
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
	 * Sets the pedidos prod.
	 *
	 * @param pedidosproductos the new pedidos prod
	 */
	public void setPedidosProd(Set<PedidosProductos> pedidosproductos) {
		this.pedidosproductos = pedidosproductos;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Productos [codprod=" + codprod + ", nombre=" + nombre + ", descripcion=" + descripcion + ", peso="
				+ peso + ", stock=" + stock + ", fkcodcat=" + fkcodcat + ", pedproductos=" + pedidosproductos + "]";
	}

}
