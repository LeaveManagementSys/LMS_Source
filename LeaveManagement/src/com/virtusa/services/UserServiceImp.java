package com.virtusa.services;

import com.virtusa.dao.UserDAO;
import com.virtusa.helper.UserData;
import com.virtusa.model.UserModel;

public class UserServiceImp implements UserService {

private UserDAO userDAO=null;
	
	public UserServiceImp() {
		this.userDAO=UserData.createUserDAO();
	}
	@Override
	public String authenticateService(UserModel userModel) {
		// TODO Auto-generated method stub
		boolean validateUser=
				userDAO.userVerification(userModel.getUserName(), userModel.getPassword());
		String userType=null;
		if(validateUser) {
			userType=userDAO.returnUserType(userModel.getUserName());	
		}

		return userType;
	}
	

}
