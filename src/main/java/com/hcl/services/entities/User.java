package com.hcl.services.entities;

import javax.persistence.*;
import java.util.*;

/**
* The class User
*/
@Entity
//TODO Set the @Id annotation for the primary key field

public class User {

	
	/** The id .*/
	private int id;
	
	/** The email .*/
	private String email;
	
	/** The firstName .*/
	private String firstName;
	
	/** The lastName .*/
	private String lastName;
	
	/** The middleName .*/
	private String middleName;
	
	/** The password .*/
	private String password;
	
	/** The userId .*/
	private String userId;
    
	 /**
     * Gets the id
     *
     * @return the id
     */
	public int getId() {
		return id;
	}
	
	 /**
     * Sets the id
     *
     * @param id the newid
     */
	public void setId(int id) {
		this.id = id;
	}
	 /**
     * Gets the email
     *
     * @return the email
     */
	public String getEmail() {
		return email;
	}
	
	 /**
     * Sets the email
     *
     * @param email the newemail
     */
	public void setEmail(String email) {
		this.email = email;
	}
	 /**
     * Gets the firstName
     *
     * @return the firstName
     */
	public String getFirstName() {
		return firstName;
	}
	
	 /**
     * Sets the firstName
     *
     * @param firstName the newfirstName
     */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	 /**
     * Gets the lastName
     *
     * @return the lastName
     */
	public String getLastName() {
		return lastName;
	}
	
	 /**
     * Sets the lastName
     *
     * @param lastName the newlastName
     */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	 /**
     * Gets the middleName
     *
     * @return the middleName
     */
	public String getMiddleName() {
		return middleName;
	}
	
	 /**
     * Sets the middleName
     *
     * @param middleName the newmiddleName
     */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	 /**
     * Gets the password
     *
     * @return the password
     */
	public String getPassword() {
		return password;
	}
	
	 /**
     * Sets the password
     *
     * @param password the newpassword
     */
	public void setPassword(String password) {
		this.password = password;
	}
	 /**
     * Gets the userId
     *
     * @return the userId
     */
	public String getUserId() {
		return userId;
	}
	
	 /**
     * Sets the userId
     *
     * @param userId the newuserId
     */
	public void setUserId(String userId) {
		this.userId = userId;
	}
}