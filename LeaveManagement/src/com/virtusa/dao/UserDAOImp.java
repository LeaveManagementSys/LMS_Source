package com.virtusa.dao;

import java.util.List;

import com.virtusa.entities.User;
import com.virtusa.enums.UserTypes;
import com.virtusa.userDetails.UserDetails;

public class UserDAOImp implements UserDAO{

private List<User> listOfUsers=null;
	
	public UserDAOImp() {
		
		this.listOfUsers=UserDetails.getUserDetails();
	}
	@Override
	public boolean userVerification(String userName, String password) {
		// TODO Auto-generated method stub
		boolean result=false;
		for(User user:listOfUsers) {	
			if(user.getUserName().equals(userName)) {
				
				if(user.getPassword().equals(password)) {
					result= true;
										
				}
			}
		}
		
		return result;
	}

	@Override
	public String returnUserType(String userName) {
		// TODO Auto-generated method stub
		String returnTypeOfUser=null;
		for(User user:listOfUsers) {
			if(user.getUserName().equals(userName)){
			UserTypes userTypes=user.getUserType();
			
			switch(userTypes) {
			
			case EMPLOYEE:
				returnTypeOfUser="EMPLOYEE";
				break;
				
			case MANAGER:
				returnTypeOfUser="MANAGER";
				break;
			
			case HR:
				returnTypeOfUser="HR";
				break;
				
			}
			
		}
		}
		return returnTypeOfUser;
	}
	
	
}
