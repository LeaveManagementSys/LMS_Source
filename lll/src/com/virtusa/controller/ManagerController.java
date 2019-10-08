package com.virtusa.controller;

import java.sql.SQLException;

import com.virtusa.dao.ManagerDAO;
import com.virtusa.model.ManagerModel;

public class ManagerController {

	public void viewListOfLeaveRequests() throws ClassNotFoundException, SQLException {
		ManagerDAO managerDAO=new ManagerDAO();
		managerDAO.getListOfLeaves();
	
	}
	public void viewApprovedLeaves() throws ClassNotFoundException, SQLException {
		ManagerDAO managerDAO=new ManagerDAO();
		managerDAO.getApprovedLeaves();
	}
	
	public void ViewListOfPendingLeaveRequests() {
		
	}
	
}
