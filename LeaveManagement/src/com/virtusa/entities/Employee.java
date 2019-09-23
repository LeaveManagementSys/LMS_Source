package com.virtusa.entities;

public class Employee extends User {

	private String empId;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + ", designation="
				+ designation + ", userType=" + userType + ", getEmpId()=" + getEmpId() + ", getUserName()="
				+ getUserName() + ", getPassword()=" + getPassword() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getEmailAddress()="
				+ getEmailAddress() + ", getPhoneNumber()=" + getPhoneNumber() + ", getDesignation()="
				+ getDesignation() + ", getUserType()=" + getUserType() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
