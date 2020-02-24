package com.proyecto.springboot.dto;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioDTO.
 */
public class UsuarioDTO {
	
	/** The id. */
	private int id;
	
	/** The username. */
	private String username;
	
	/** The password. */
	private String password;
	
	/**
	 * Instantiates a new usuario DTO.
	 */
	public UsuarioDTO() {
		super();
	}
	
	/**
	 * Instantiates a new usuario DTO.
	 *
	 * @param id the id
	 * @param username the username
	 * @param password the password
	 */
	public UsuarioDTO(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "UsuarioDTO [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

}
