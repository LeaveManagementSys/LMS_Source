package com.virtusa.service;

import java.sql.SQLException;

import com.virtusa.dao.ManagerDAO;

public class ManagerService {

	public void LeaveRequests() throws ClassNotFoundException, SQLException {
		ManagerDAO managerDAO=new ManagerDAO();
		managerDAO.getListOfLeaves();
	}
}
