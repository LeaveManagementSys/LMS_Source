package com.virtusa.entities;

public class Student extends User{
	
	private String studentId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstname=" + firstname + ", lastname=" + lastname + ", Dob="
				+ Dob + ", email=" + email + ", phoneNumber=" + phoneNumber + ", getStudentId()=" + getStudentId()
				+ ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() + ", getFirstname()="
				+ getFirstname() + ", getLastname()=" + getLastname() + ", getDob()=" + getDob() + ", getEmail()="
				+ getEmail() + ", getPhoneNumber()=" + getPhoneNumber() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
