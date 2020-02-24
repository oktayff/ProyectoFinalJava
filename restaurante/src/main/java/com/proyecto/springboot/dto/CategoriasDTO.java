package com.proyecto.springboot.dto;

// TODO: Auto-generated Javadoc
/**
 * The Class CategoriasDTO.
 */
public class CategoriasDTO {

	/** The codcat. */
	private int codcat;

	/** The nombre. */
	private String nombre;

	/** The descripcion. */
	private String descripcion;
	
	/**
	 * Instantiates a new categorias DTO.
	 */
	public CategoriasDTO() {
		super();
	}

	/**
	 * Instantiates a new categorias DTO.
	 *
	 * @param codcat      the codcat
	 * @param nombre      the nombre
	 * @param descripcion the descripcion
	 */
	public CategoriasDTO(int codcat, String nombre, String descripcion) {
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
		return "CategoriasDTO [codcat=" + codcat + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

}
