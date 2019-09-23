package com.virtusa.entities;

import com.virtusa.enums.LeaveTypes;

public class Leave {

	public Leave() {
		
	}
	
	public String leaveId;
	public LeaveTypes leaveTypes;
	public String description;
	public String applyDate;
	public String startDate;
	public String endDate;
	public String status;
	public String getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(String leaveId) {
		this.leaveId = leaveId;
	}
	public LeaveTypes getLeaveTypes() {
		return leaveTypes;
	}
	public void setLeaveTypes(LeaveTypes leaveTypes) {
		this.leaveTypes = leaveTypes;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Leave [leaveId=" + leaveId + ", leaveTypes=" + leaveTypes + ", description=" + description
				+ ", applyDate=" + applyDate + ", startDate=" + startDate + ", endDate=" + endDate + ", status="
				+ status + ", getLeaveId()=" + getLeaveId() + ", getLeaveTypes()=" + getLeaveTypes()
				+ ", getDescription()=" + getDescription() + ", getApplyDate()=" + getApplyDate() + ", getStartDate()="
				+ getStartDate() + ", getEndDate()=" + getEndDate() + ", getStatus()=" + getStatus() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
