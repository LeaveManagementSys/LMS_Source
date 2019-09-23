package com.virtusa.dao;

public interface UserDAO {
	public boolean userVerification(String userName,String password);
	public String returnUserType(String userName);
}
