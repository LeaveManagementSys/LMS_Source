package com.virtusa.userDetails;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Employee;
import com.virtusa.entities.HR;
import com.virtusa.entities.Leave;
import com.virtusa.entities.Manager;
import com.virtusa.entities.User;
import com.virtusa.enums.UserTypes;

public class UserDetails {

	private static List<User> userDetails=
			new ArrayList<User>();
	static{
		
		Employee employee=new Employee();
		employee.setUserName("vamshikrishna");
		employee.setPassword("vamshi@123");
		employee.setFirstName("vamshi");
		employee.setLastName("vemula");
		employee.setEmailAddress("vamshikrishna@hotmail.com");
		employee.setPhoneNumber("7090785647");
		employee.setDateOfBirth("01-01-1997");
		employee.setEmpId("E001");
		employee.setDesignation("associate engineer");
		employee.setUserType(UserTypes.EMPLOYEE);
		userDetails.add(employee);
		
		Manager manager=new Manager();
		manager.setUserName("manager");
		manager.setPassword("manager");
		manager.setFirstName("krishna");
		manager.setLastName("kumar");
		manager.setEmailAddress("manager@virtusa.com");
		manager.setPhoneNumber("7898765678");
		manager.setDateOfBirth("01-0q-1988");
		manager.setManagerId("M001");
		manager.setDesignation("manager");
		manager.setUserType(UserTypes.MANAGER);
		userDetails.add(manager);	
		
		HR hr = new HR();
		hr.setUserName("hr");
		hr.setPassword("hr");
		hr.setFirstName("krishna");
		hr.setLastName("kumar");
		hr.setEmailAddress("manager@virtusa.com");
		hr.setPhoneNumber("7898765678");
		hr.setDateOfBirth("01-0q-1988");
		hr.setHrId("M001");
		hr.setDesignation("manager");
		hr.setUserType(UserTypes.HR);
		userDetails.add(hr);	
		
		/*Leave leave=new Leave();
		leave.setLeaveId("L001");
		leave.setLeaveTypes(LeaveTypes.);*/
	}
	public static List<User> getUserDetails() {
		return userDetails;
	}
}
