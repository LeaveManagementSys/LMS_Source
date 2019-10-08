package com.virtusa.model;

public class ManagerModel {
	private String emp_Id;
	private String leave_Id;
	public String leave_Type ;
	private String from_Date ;
	private String to_Date ;
	private String designation ;
	private String leave_Desc ;
	public String leave_Balances ;
	private String leave_Status ;
	public String getEmployee_Id() {
		return emp_Id;
	}
	public void setEmployee_Id(String emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getLeave_Id() {
		return leave_Id;
	}
	public void setLeave_Id(String leave_Id) {
		this.leave_Id = leave_Id;
	}
	public String getLeave_Type() {
		return leave_Type;
	}
	public void setLeave_Type(String leave_Type) {
		this.leave_Type = leave_Type;
	}
	public String getFrom_Date() {
		return from_Date;
	}
	public void setFrom_Date(String from_Date) {
		this.from_Date = from_Date;
	}
	public String getTo_Date() {
		return to_Date;
	}
	public void setTo_Date(String to_Date) {
		this.to_Date = to_Date;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLeave_Desc() {
		return leave_Desc;
	}
	public void setLeave_Desc(String leave_Desc) {
		this.leave_Desc = leave_Desc;
	}
	public String getLeave_Balances() {
		return leave_Balances;
	}
	public void setLeave_Balances(String leave_Balances) {
		this.leave_Balances = leave_Balances;
	}
	public String getLeave_Status() {
		return leave_Status;
	}
	public void setLeave_Status(String leave_Status) {
		this.leave_Status = leave_Status;
	}
	@Override
	public String toString() {
		return "ManagerModel [emp_Id=" + emp_Id + ", leave_Id=" + leave_Id + ", leave_Type=" + leave_Type
				+ ", from_Date=" + from_Date + ", to_Date=" + to_Date + ", designation=" + designation + ", leave_Desc="
				+ leave_Desc + ", leave_Balances=" + leave_Balances + ", leave_Status=" + leave_Status + "]";
	}
	
}
