package com.virtusa.entities;

public class HR extends User{

	public HR() {
		
	}
	private String hrId;
	public String getHrId() {
		return hrId;
	}
	public void setHrId(String hrId) {
		this.hrId = hrId;
	}
	@Override
	public String toString() {
		return "HR [hrId=" + hrId + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", designation="
				+ designation + ", userType=" + userType + ", getHrId()=" + getHrId() + ", getUserName()="
				+ getUserName() + ", getPassword()=" + getPassword() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getEmailAddress()="
				+ getEmailAddress() + ", getPhoneNumber()=" + getPhoneNumber() + ", getDesignation()="
				+ getDesignation() + ", getUserType()=" + getUserType() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
