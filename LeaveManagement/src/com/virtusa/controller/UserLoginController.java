package com.virtusa.controller;

import com.virtusa.exceptions.UserException;
import com.virtusa.helper.UserData;
import com.virtusa.model.UserModel;
import com.virtusa.services.UserService;
import com.virtusa.view.EmployeeView;
import com.virtusa.view.ErrorView;
import com.virtusa.view.HRView;
import com.virtusa.view.ManagerView;

public class UserLoginController {
	
	private UserService userService;
	public UserLoginController() {
		this.userService=UserData.createUserService();
		
	}
	
	public void userVerification(String userName,String password) {
		
		UserModel userModel=new UserModel();
		userModel.setUserName(userName);
		userModel.setPassword(password);
		try {
		String userType=
				userService.authenticateService(userModel);
		
		if(userType.contentEquals("EMPLOYEE")) {
			EmployeeView employeeView=new EmployeeView();
			employeeView.employeeHomePage();
		}else if(userType.contentEquals("MANAGER")) {
			ManagerView adminView=new ManagerView();
			adminView.managerHomePage();
		}else if(userType.contentEquals("HR")) {
			HRView hrView=new HRView();
			hrView.hrHomePage();
		}
		}catch(UserException e) {
			ErrorView errorView=new ErrorView();
			errorView.error();
			
		}
		
	}

}
