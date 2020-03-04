package com.proyecto.springboot.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * The Class Categorias.
 *
 * @author Oktay
 */

// TODO: Auto-generated Javadoc
/**
 * The Class Categorias.
 */
@Entity
@Table(name="categorias")
public class Categorias implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The codcat. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codcat;
	
	/** The nombre. */
	@NotNull
	@Column(length=45, unique=true)
	private String nombre;
	
	/** The descripcion. */
	@NotNull
	@Column(length=200)
	private String descripcion;
	
	/** The productos. */
	@OneToMany(mappedBy="codprod")
    private Set<Productos> productos;
	
	/**
	 * Instantiates a new categorias.
	 */
	public Categorias() {
		super();
	}

	/**
	 * Instantiates a new categorias.
	 *
	 * @param codcat the codcat
	 * @param nombre the nombre
	 * @param descripcion the descripcion
	 * @param productos the productos
	 */
	public Categorias(int codcat, String nombre, String descripcion, Set<Productos> productos) {
		super();
		this.codcat = codcat;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.productos = productos;
	}
	
	/**
	 * Instantiates a new categorias.
	 *
	 * @param codcat the codcat
	 * @param nombre the nombre
	 * @param descripcion the descripcion
	 */
	public Categorias(int codcat, String nombre, String descripcion) {
		super();
		this.codcat = codcat;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	/**
	 * Instantiates a new categorias.
	 *
	 * @param nombre the nombre
	 * @param descripcion the descripcion
	 */
	public Categorias(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}


	/**
	 * Gets the codcat.
	 *
	 * @return the codcat
	 */
	public int getCodcat() {
		return codcat;
	}

	/**
	 * Sets the codcat.
	 *
	 * @param codcat the new codcat
	 */
	public void setCodcat(int codcat) {
		this.codcat = codcat;
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
	 * Gets the productos.
	 *
	 * @return the productos
	 */
	public Set<Productos> getProductos() {
		return productos;
	}

	/**
	 * Sets the productos.
	 *
	 * @param productos the new productos
	 */
	public void setProductos(Set<Productos> productos) {
		this.productos = productos;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Categorias [codcat=" + codcat + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
}
