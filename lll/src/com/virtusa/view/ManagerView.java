package com.virtusa.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.virtusa.controller.ManagerController;
import com.virtusa.integrate.ConnectionManager;

public class ManagerView {

	Scanner sc=new Scanner(System.in);
	public void ManagerPage() throws ClassNotFoundException, SQLException {
		System.out.println("*****WELCOME TO MANAGER VIEW*******");
		System.out.println("1.View list of leave requests");
		System.out.println("2.logout");
		System.out.println("enter option");
		int option=sc.nextInt();
		
		switch(option) {
		
		case 1:
			Connection connection=ConnectionManager.openConnection();
			Statement statement=connection.createStatement();
			ResultSet resultSet=
					statement.executeQuery("select * from Leaves");
			resultSet.next();
			ManagerController managerController=new ManagerController();
			managerController.viewListOfLeaveRequests();
			System.out.println("1.View Approved leaves");
			System.out.println("2.View list of Pending leave requests");
			System.out.println("Enter option");
			int option1=sc.nextInt();
			switch(option1) {
			case 1:
				managerController.viewApprovedLeaves();
				break;
			
			case 2:
				managerController.ViewListOfPendingLeaveRequests();
			}
			break;
		case 2:
			System.out.println("successfully logged out");
			break;
		}
		
		
	}
	public void viewListOfLeaveRequests() throws ClassNotFoundException, SQLException {
		ManagerController managerController=new ManagerController();
		managerController.viewListOfLeaveRequests();
	}
}
