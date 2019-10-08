package com.virtusa.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtusa.integrate.ConnectionManager;
import com.virtusa.model.ApprovedLeaves;
import com.virtusa.model.ManagerModel;


public class ManagerDAO {
	public List<ManagerModel> getListOfLeaves() throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select * from Leaves");
		List<ManagerModel> listOfLeaveRequest=new ArrayList<ManagerModel>();
		while(resultSet.next()) {
			ManagerModel managerModel=new ManagerModel();
			managerModel.setLeave_Id(resultSet.getString("leave_Id"));
			managerModel.setEmployee_Id(resultSet.getString("emp_Id"));
			managerModel.setLeave_Type(resultSet.getString("leave_Type"));
			managerModel.setLeave_Balances(resultSet.getString("leave_Balances"));
			managerModel.setLeave_Status(resultSet.getString("leave_Status"));
			managerModel.setFrom_Date(resultSet.getString("from_Date"));
			managerModel.setTo_Date(resultSet.getString("to_Date"));
			managerModel.setDesignation(resultSet.getString("designation"));
			managerModel.setLeave_Desc(resultSet.getString("leave_Desc"));
			listOfLeaveRequest.add(managerModel);
			System.out.println(managerModel);
		}
		ConnectionManager.closeConnection();
		return listOfLeaveRequest;
	}
	public  List<ApprovedLeaves> getApprovedLeaves() throws ClassNotFoundException, SQLException {
		Connection connection=ConnectionManager.openConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=
				statement.executeQuery("select Emp_Id,Leave_Type,Leave_Status from Leaves where Leave_Status");
		List<ApprovedLeaves> approvedLeavesList = new ArrayList<>();
		while(resultSet.next()) {
			ApprovedLeaves approvedLeaves=new ApprovedLeaves();
			approvedLeaves.setEmp_Id(resultSet.getString("Emp_Id"));
			approvedLeaves.setLeave_Status(resultSet.getString("Leaves_Status"));
			approvedLeaves.setLeave_Type(resultSet.getString("Leave_Type"));
			approvedLeavesList.add(approvedLeaves);
			System.out.println(approvedLeaves);
		}
		ConnectionManager.closeConnection();
		return approvedLeavesList;
		
	}
}