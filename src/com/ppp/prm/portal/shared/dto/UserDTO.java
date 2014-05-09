package com.ppp.prm.portal.shared.dto;

/**
 * Authentification DTO class.
 * It is a serialisable class : to authorise its transfert via RPC 
 * @author aalaoui
 * @version 1.0
 */
public class UserDTO implements java.io.Serializable {

	public UserDTO()
	{
		
	}
	
	public UserDTO (String login, String password)
	{
		this.login = login;
		this.password = password;
	}
	
	/**
	 * @return the iduser
	 */
	public Integer getIduser() {
		return iduser;
	}
	/**
	 * @param iduser the iduser to set
	 */
	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * The user id
	 */
	Integer iduser;
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * The user login
	 */
	String login;
	/**
	 * The user password
	 */
	String password;
	/**
	 * The user fullName
	 */
	String fullName;
	/**
	 * The user email
	 */
	String email;
	
	
   }
