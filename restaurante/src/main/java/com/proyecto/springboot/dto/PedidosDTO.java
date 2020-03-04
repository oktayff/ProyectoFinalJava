package com.proyecto.springboot.dto;

import java.util.Date;
import com.proyecto.springboot.entities.Restaurantes;

// TODO: Auto-generated Javadoc
/**
 * The Class PedidosDTO.
 */
public class PedidosDTO {


	/** The codped. */
	private int codped;
	

	/** The fecha. */
	private Date fecha;
	

	/** The enviado. */
	private int enviado;
	
	/** The fk codres. */
	private Restaurantes fk_codres;
	

	/**
	 * Instantiates a new pedidos DTO.
	 */
	public PedidosDTO() {
		super();
	}
	

	/**
	 * Instantiates a new pedidos DTO.
	 *
	 * @param codped the codped
	 * @param fecha the fecha
	 * @param enviado the enviado
	 * @param fk_codres the fk codres
	 */
	public PedidosDTO(int codped, Date fecha, int enviado, Restaurantes fk_codres) {
		super();
		this.codped = codped;
		this.fecha = fecha;
		this.enviado = enviado;
		this.fk_codres = fk_codres;
	}
	
	/**
	 * Instantiates a new pedidos DTO.
	 *
	 * @param enviado the enviado
	 * @param fecha the fecha
	 * @param fk_codres the fk codres
	 */
	public PedidosDTO(int enviado, Date fecha, Restaurantes fk_codres) {
		this.enviado = enviado;
		this.fecha = fecha;
		this.fk_codres = fk_codres;
		
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
	 * Gets the fk codres.
	 *
	 * @return the fk codres
	 */
	public Restaurantes getFk_codres() {
		return fk_codres;
	}


	/**
	 * Sets the fk codres.
	 *
	 * @param fk_codres the new fk codres
	 */
	public void setFk_codres(Restaurantes fk_codres) {
		this.fk_codres = fk_codres;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "PedidosDTO [codped=" + codped + ", fecha=" + fecha + ", enviado=" + enviado + ", fk_codres=" + fk_codres
				+ "]";
	}

}
