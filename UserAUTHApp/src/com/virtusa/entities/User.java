package com.virtusa.entities;

import com.virtusa.utilities.UserTypes;

public class User {

	public User() {
		
	}
	private String username;
	private String password;
	
	protected String firstname;
	protected String lastname;
	protected String Dob;
	protected String email;
	protected String phoneNumber;
	protected UserTypes userType;
	
	
	public UserTypes getUserType() {
		return userType;
	}
	public void setUserType(UserTypes userType) {
		this.userType = userType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", Dob=" + Dob + ", email=" + email + ", phoneNumber=" + phoneNumber + ", userType="
				+ userType + "]";
	}
}

