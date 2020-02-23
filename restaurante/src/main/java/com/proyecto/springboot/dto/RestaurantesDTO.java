package com.proyecto.springboot.dto;

// TODO: Auto-generated Javadoc
/**
 * The Class RestaurantesDTO.
 */
public class RestaurantesDTO {
	
	/** The codres. */
	private int codres;
	
	/** The correo. */
	private String correo;
	
	/** The clave. */
	private String clave;
	
	/** The pais. */
	private String pais;
	
	/** The cp. */
	private String cp;
	
	/** The ciudad. */
	private String ciudad;
	
	/** The direccion. */
	private String direccion;
	
	/**
	 * Instantiates a new restaurantes DTO.
	 *
	 * @param codres the codres
	 * @param correo the correo
	 * @param clave the clave
	 * @param pais the pais
	 * @param cp the cp
	 * @param ciudad the ciudad
	 * @param direccion the direccion
	 */
	public RestaurantesDTO(int codres, String correo, String clave, String pais, String cp, String ciudad,
			String direccion) {
		super();
		this.codres = codres;
		this.correo = correo;
		this.clave = clave;
		this.pais = pais;
		this.cp = cp;
		this.ciudad = ciudad;
		this.direccion = direccion;
	}
	
	/**
	 * Gets the codres.
	 *
	 * @return the codres
	 */
	public int getCodres() {
		return codres;
	}
	
	/**
	 * Sets the codres.
	 *
	 * @param codres the new codres
	 */
	public void setCodres(int codres) {
		this.codres = codres;
	}
	
	/**
	 * Gets the correo.
	 *
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	
	/**
	 * Sets the correo.
	 *
	 * @param correo the new correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	/**
	 * Gets the clave.
	 *
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}
	
	/**
	 * Sets the clave.
	 *
	 * @param clave the new clave
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	/**
	 * Gets the pais.
	 *
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	
	/**
	 * Sets the pais.
	 *
	 * @param pais the new pais
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	/**
	 * Gets the cp.
	 *
	 * @return the cp
	 */
	public String getCp() {
		return cp;
	}
	
	/**
	 * Sets the cp.
	 *
	 * @param cp the new cp
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}
	
	/**
	 * Gets the ciudad.
	 *
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	
	/**
	 * Sets the ciudad.
	 *
	 * @param ciudad the new ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "RestaurantesDTO [codres=" + codres + ", correo=" + correo + ", clave=" + clave + ", pais=" + pais
				+ ", cp=" + cp + ", ciudad=" + ciudad + ", direccion=" + direccion + "]";
	}
	
}
