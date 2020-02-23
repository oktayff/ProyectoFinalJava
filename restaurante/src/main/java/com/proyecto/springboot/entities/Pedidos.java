package com.proyecto.springboot.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

// TODO: Auto-generated Javadoc
/**
 * The Class Pedidos.
 */
@Entity
@Table(name="pedidos")
public class Pedidos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/** The codped. */
	@Id
	@NotNull
	private int codped;
	
	/** The fecha. */
	@NotNull
	private Date fecha;
	
	/** The enviado. */
	@NotNull
	private int enviado;
	
	/** The fk codres. */
	@NotNull
	private int fk_codres;

	/**
	 * Instantiates a new pedidos.
	 *
	 * @param codped the codped
	 * @param fecha the fecha
	 * @param enviado the enviado
	 * @param fk_codres the fk codres
	 */
	public Pedidos(int codped, Date fecha, int enviado, int fk_codres) {
		super();
		this.codped = codped;
		this.fecha = fecha;
		this.enviado = enviado;
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
	public int getFk_codres() {
		return fk_codres;
	}

	/**
	 * Sets the fk codres.
	 *
	 * @param fk_codres the new fk codres
	 */
	public void setFk_codres(int fk_codres) {
		this.fk_codres = fk_codres;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Pedidos [codped=" + codped + ", fecha=" + fecha + ", enviado=" + enviado + ", fk_codres=" + fk_codres
				+ "]";
	}
	
}
