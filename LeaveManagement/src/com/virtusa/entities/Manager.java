package com.virtusa.entities;

public class Manager extends User {
	
	public Manager() {
		
	}
	private String managerId;
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber
				+ ", designation=" + designation + ", userType=" + userType + ", getManagerId()=" + getManagerId()
				+ ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getDateOfBirth()=" + getDateOfBirth()
				+ ", getEmailAddress()=" + getEmailAddress() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getDesignation()=" + getDesignation() + ", getUserType()=" + getUserType() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
