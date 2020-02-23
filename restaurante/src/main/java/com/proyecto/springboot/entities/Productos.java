package com.proyecto.springboot.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

// TODO: Auto-generated Javadoc
/**
 * The Class Productos.
 */
@Entity
@Table(name="productos")
public class Productos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/** The codprod. */
	@Id
	@NotNull
	private int codprod;
	
	/** The nombre. */
	@NotNull
	@Column(length=45, unique=true)
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
	
	/** The categoria. */
	@NotNull
	private int fk_codcat;

	/**
	 * Instantiates a new productos.
	 *
	 * @param codprod the codprod
	 * @param nombre the nombre
	 * @param descripcion the descripcion
	 * @param peso the peso
	 * @param stock the stock
	 * @param fk_codcat the fk codcat
	 */
	public Productos(int codprod, String nombre, String descripcion, int peso, int stock, int fk_codcat) {
		super();
		this.codprod = codprod;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.peso = peso;
		this.stock = stock;
		this.fk_codcat = fk_codcat;
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
	 * Gets the fk codcat.
	 *
	 * @return the fk codcat
	 */
	public int getFk_codcat() {
		return fk_codcat;
	}

	/**
	 * Sets the fk codcat.
	 *
	 * @param fk_codcat the new fk codcat
	 */
	public void setFk_codcat(int fk_codcat) {
		this.fk_codcat = fk_codcat;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Productos [codprod=" + codprod + ", nombre=" + nombre + ", descripcion=" + descripcion + ", peso="
				+ peso + ", stock=" + stock + ", fk_codcat=" + fk_codcat + "]";
	}

}
