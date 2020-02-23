package com.proyecto.springboot.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

// TODO: Auto-generated Javadoc
/**
 * The Class Categorias.
 */
@Entity
@Table(name="categorias")
public class Categorias implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/** The codcat. */
	@Id
	@NotNull
	private int codcat;
	
	/** The nombre. */
	@NotNull
	@Column(length=45, unique=true)
	private String nombre;
	
	/** The descripcion. */
	@NotNull
	@Column(length=200)
	private String descripcion;

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
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Categorias [codcat=" + codcat + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
}
