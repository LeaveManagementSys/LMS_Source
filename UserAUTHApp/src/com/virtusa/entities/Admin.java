package com.virtusa.entities;

public class Admin extends User {
	
	public Admin()
	{
		
	}

	private String adminId;

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", firstname=" + firstname + ", lastname=" + lastname + ", Dob=" + Dob
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", userType=" + userType + ", getAdminId()="
				+ getAdminId() + ", getUserType()=" + getUserType() + ", getUsername()=" + getUsername()
				+ ", getPassword()=" + getPassword() + ", getFirstname()=" + getFirstname() + ", getLastname()="
				+ getLastname() + ", getDob()=" + getDob() + ", getEmail()=" + getEmail() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
