package com.virtusa.helper;

import com.virtusa.dao.UserDAO;
import com.virtusa.dao.UserDAOImp;
import com.virtusa.services.UserService;
import com.virtusa.services.UserServiceImp;

public class UserData {
	public static UserDAO createUserDAO() {
		UserDAO userDAO=new UserDAOImp();
		return userDAO;
	}
	public static UserService createUserService() {
		UserService userService=new UserServiceImp();
		return userService;
	}
}
