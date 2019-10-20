package com.virtusa.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.convertor.DateConverter;
import com.virtusa.helper.FactoryHr;
import com.virtusa.model.InsertEmployeeModel;
import com.virtusa.model.RetriveEmployeeDesignationModel;
import com.virtusa.model.RetriveEmployeeModel;
import com.virtusa.model.UpdateEmpPhoneNumberModel;
import com.virtusa.model.UpdateEmployeeDesignationModel;
import com.virtusa.model.UpdateEmployeeSalaryModel;
import com.virtusa.service.HrService;
import com.virtusa.validation.EmployeesModelValidator;


/**
 * Servlet implementation class Hrservlet
 */
@WebServlet("/Hrservlet")
public class Hrservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HrService hrservice=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hrservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		this.hrservice=FactoryHr.createHrService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String action=request.getParameter("action");	
		 if(action.contentEquals("viewallemployees")) {
	  
			 List<RetriveEmployeeModel> retriveEmployeeList=hrservice.retrieveEmployees();
				request.setAttribute("retriveEmployeeList",retriveEmployeeList);
				RequestDispatcher dispatcher=
						request.getRequestDispatcher("employeedetailsdelete.jsp");
				dispatcher.forward(request, response);
			}	
		
		 if(action.contentEquals("view")) {
	  
			 List<RetriveEmployeeModel> retriveEmployeeList=hrservice.retrieveEmployees();
				request.setAttribute("retriveEmployeeList",retriveEmployeeList);
				RequestDispatcher dispatcher=
						request.getRequestDispatcher("employeedetails.jsp");
				dispatcher.forward(request, response);
			}
		 if(action.contentEquals("updateemployeesalary")){
			  
			 List<RetriveEmployeeModel> retriveEmployeeList=hrservice.retrieveEmployees();
				request.setAttribute("retriveEmployeeList",retriveEmployeeList);
				RequestDispatcher dispatcher=
						request.getRequestDispatcher("employeesalaryupdateform.jsp");
				dispatcher.forward(request, response);
			}
		 
		 if(action.contentEquals("updateemployeephonenumber")){
			  
			 List<RetriveEmployeeModel> retriveEmployeeList=hrservice.retrieveEmployees();
				request.setAttribute("retriveEmployeeList",retriveEmployeeList);
				RequestDispatcher dispatcher=
						request.getRequestDispatcher("employeephonenumberupdateform.jsp");
				dispatcher.forward(request, response);
			}
		 if(action.contentEquals("updateemployeedesignation")){
			  
			 List<RetriveEmployeeModel> retriveEmployeeList=hrservice.retrieveEmployees();
			 List<RetriveEmployeeDesignationModel> designationList=hrservice.retrieveDesignation();
			 request.setAttribute("designationList", designationList);
				request.setAttribute("retriveEmployeeList",retriveEmployeeList);
				RequestDispatcher dispatcher=
						request.getRequestDispatcher("employeedesignationupdateform.jsp");
				dispatcher.forward(request, response);
			}
		 
		 if(action.contentEquals("loadform")){
			 List<RetriveEmployeeDesignationModel> designationList=hrservice.retrieveDesignation();
				request.setAttribute("designationList", designationList);
				RequestDispatcher dispatcher=
						request.getRequestDispatcher("registrationform.jsp");
				dispatcher.forward(request, response);
			}
		 
		 
		 
		 
		 
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String action=request.getParameter("action");
		 
		 
		 if(action.contentEquals("deleteEmployee")) {
			 
	        	int employeeId=Integer.parseInt(request.getParameter("employeeId"));
	
	        	RetriveEmployeeModel retriveemployeemodel=new RetriveEmployeeModel();
	        
	        	retriveemployeemodel.setEmployeeId(employeeId);
	        	String outcome=hrservice.deleteEmployee(retriveemployeemodel);
	        	List<RetriveEmployeeModel> allEmployeesList=hrservice.retrieveEmployees();
	        	for(RetriveEmployeeModel employees:allEmployeesList) {
	        		if(retriveemployeemodel.getEmployeeId()==employeeId) {
	        			retriveemployeemodel=employees;
	        		}
	        	}
	        	if(outcome.contentEquals("success")) {
	      			 RequestDispatcher dispatcher=
	      	    				request.getRequestDispatcher("deletionsuccess.jsp");
	      			 request.setAttribute("retriveemployeemodel",retriveemployeemodel);
	      			 request.setAttribute("operation", "Below Employee record deleted Successfully");
	      	    		dispatcher.forward(request,response);
	      		}else {
	      			 RequestDispatcher dispatcher=
	      	    				request.getRequestDispatcher("deletionfail.jsp");
	      			 request.setAttribute("operation", "Employee Deletion Failed");

	      	    		dispatcher.forward(request,response);
	      		}
		 }
		 
		 if(action.contentEquals("updatesalaryform")) {
	        	
			 int employeeId=Integer.parseInt(request.getParameter("employeeId"));
			
	        	RequestDispatcher dispatcher=
	    				request.getRequestDispatcher("updatesalaryform.jsp");
	        List<RetriveEmployeeModel> allEmployeesList=hrservice.retrieveEmployees();
	        
	        RetriveEmployeeModel retriveemployeemodel=new RetriveEmployeeModel();
	        	
	        	for(RetriveEmployeeModel employees:allEmployeesList) {
	        		if(employees.getEmployeeId()==employeeId) {
	        			retriveemployeemodel=employees;
	        		}
	        	}
	        	request.setAttribute("retriveemployeemodel", retriveemployeemodel);
	        	
	        	dispatcher.forward(request,response);
	        }
		 

	        	
		 if(action.contentEquals("updatesalary"))
		 {
			 int employeeId=Integer.parseInt(request.getParameter("employeeId"));
			 System.out.println("form"+employeeId);
			 
			 double newSalary=Double.parseDouble(request.getParameter("newSalary"));

	            	
		        	UpdateEmployeeSalaryModel updateemployeesalary=new UpdateEmployeeSalaryModel();
		        	updateemployeesalary.setNewSalary(newSalary);
		        	updateemployeesalary.setEmployeeId(employeeId); 		
	    		String outcome=hrservice.salaryupdate(updateemployeesalary);
	    		if(outcome.contentEquals("success")) {
	   			 RequestDispatcher dispatcher=
	   	    				request.getRequestDispatcher("employeesalaryupdationsuccess.jsp");
	   			 request.setAttribute("updateemployeesalary",updateemployeesalary);
	   			 request.setAttribute("operation", "Below Employee record Updated Successfully");
	   	    		dispatcher.forward(request,response);
	   		}else {
	   			 RequestDispatcher dispatcher=
	   	    				request.getRequestDispatcher("employeesalaryupdationfail.jsp");
	   			 request.setAttribute("operation", "Employee Update Failed");

	   	    		dispatcher.forward(request,response);
	   		}
		 }
		 
		 if(action.contentEquals("updatephonenumberform")) {
	        	
			 int employeeId=Integer.parseInt(request.getParameter("employeeId"));
		
	        	RequestDispatcher dispatcher=
	    				request.getRequestDispatcher("updateemployeephonenumber.jsp");
	        List<RetriveEmployeeModel> allEmployeesList=hrservice.retrieveEmployees();
	        
	        RetriveEmployeeModel retriveemployeemodel=new RetriveEmployeeModel();
	        	
	        	for(RetriveEmployeeModel employees:allEmployeesList) {
	        		if(employees.getEmployeeId()==employeeId) {
	        			retriveemployeemodel=employees;
	        		}
	        	}
	        	request.setAttribute("retriveemployeemodel", retriveemployeemodel);	        	
	        	dispatcher.forward(request,response);
	        }
		 
		 if(action.contentEquals("updatephonenumber"))
		 {
			 int employeeId=Integer.parseInt(request.getParameter("employeeId"));
			 
			 String newphoneNumber=request.getParameter("newPhoneNumber");
              
			 UpdateEmpPhoneNumberModel updateempphonenumbermodel=new UpdateEmpPhoneNumberModel();
			 updateempphonenumbermodel.setEmployeeId(employeeId);
			 updateempphonenumbermodel.setNewphoneNumber(newphoneNumber);
		        			
	    		String outcome=hrservice.phoneNumberUpdate(updateempphonenumbermodel);
	    		if(outcome.contentEquals("success")) {
	   			 System.out.println("outcome"+outcome);
	    			RequestDispatcher dispatcher=
	   	    				request.getRequestDispatcher("employeesalaryupdationsuccess.jsp");
	   			 request.setAttribute("updateempphonenumbermodel",updateempphonenumbermodel);
	   			 request.setAttribute("operation", "Below Employee phone number Updated Successfully");
	   	    		dispatcher.forward(request,response);
	   		}else {
	   			 RequestDispatcher dispatcher=
	   	    				request.getRequestDispatcher("employeesalaryupdationfail.jsp");
	   			 request.setAttribute("operation", "Employee phonenumber Update Failed");

	   	    		dispatcher.forward(request,response);
	   		}
		 }
		 if(action.contentEquals("updatedesignationform")) {
	        	
			 int employeeId=Integer.parseInt(request.getParameter("employeeId"));
			
	        	RequestDispatcher dispatcher=
	    				request.getRequestDispatcher("updateemployeedesignation.jsp");
	        List<RetriveEmployeeModel> allEmployeesList=hrservice.retrieveEmployees();
	        List<RetriveEmployeeDesignationModel> designationList=hrservice.retrieveDesignation();
			 request.setAttribute("designationList", designationList);
	        
	        RetriveEmployeeModel retriveemployeemodel=new RetriveEmployeeModel();
	        	
	        	for(RetriveEmployeeModel employees:allEmployeesList) {
	        		if(employees.getEmployeeId()==employeeId) {
	        			retriveemployeemodel=employees;
	        		}
	        	}
	        	request.setAttribute("retriveemployeemodel", retriveemployeemodel);	        	
	        	dispatcher.forward(request,response);
	        }
		 if(action.contentEquals("updatedesignation"))
		 {
			 int employeeId=Integer.parseInt(request.getParameter("employeeId"));
			 System.out.println("updatep"+employeeId);
			 String updateDesignation=request.getParameter("designation");
              System.out.println("update"+updateDesignation);
	            	
              UpdateEmployeeDesignationModel updateemployeedesgmodel=new UpdateEmployeeDesignationModel();
              updateemployeedesgmodel.setEmployeeId(employeeId);
              updateemployeedesgmodel.setUpdateDesignation(updateDesignation);
	    		String outcome=hrservice.designationUpdate(updateemployeedesgmodel);
	    		if(outcome.contentEquals("success")) {
	   			 System.out.println("outcome"+outcome);
	    			RequestDispatcher dispatcher=
	   	    				request.getRequestDispatcher("employeesalaryupdationsuccess.jsp");
	   			 request.setAttribute("updateemployeedesgmodel",updateemployeedesgmodel);
	   			 request.setAttribute("operation", "Below Employee phone number Updated Successfully");
	   	    		dispatcher.forward(request,response);
	   		}else {
	   			 RequestDispatcher dispatcher=
	   	    				request.getRequestDispatcher("employeesalaryupdationfail.jsp");
	   			 request.setAttribute("operation", "Employee phonenumber Update Failed");

	   	    		dispatcher.forward(request,response);
	   		}
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 if(action.contentEquals("newEmployee")) 
		 {
			 int employeeId=Integer.parseInt(request.getParameter("employeeId"));
			    String firstName=request.getParameter("firstName");
	        	String lastName=request.getParameter("lastName");
	        	String email=request.getParameter("email");
	        	String phoneNumber=request.getParameter("phoneNumber");
	        	String hire_Date=request.getParameter("hireDate");
	        	LocalDate hireDate=DateConverter.convertLocaleDate(hire_Date, "-");
	        	String date_Of_Birth=request.getParameter("dateOfBirth");
	        	LocalDate dateOfBirth=DateConverter.convertLocaleDate(date_Of_Birth, "-");
	        	double salary=Double.parseDouble(request.getParameter("salary"));
	        	String designation=request.getParameter("designation");
	        	String jobLocation=request.getParameter("location");
	        	
	        	EmployeesModelValidator validator=new EmployeesModelValidator();
	        	boolean employeeIdExist=validator.employeeIdExists(employeeId);
	        	boolean emailExist=validator.emailExist(email);
	        	boolean validFirstName=validator.validString(firstName);
	        	boolean validLastName=validator.validString(lastName);
	        	boolean validEmail=validator.validEmail(email);
	        	boolean validSalary=validator.validSalary(salary);
	        	
	        	if(employeeIdExist || !validFirstName || !validLastName || !validEmail || !validSalary || emailExist) {
	        		
	        		  if(employeeIdExist) {
	                  	request.setAttribute("employeeIderror","Employee Id already exist");

	                  }
	                  if(!validFirstName) {
	              		request.setAttribute("firstnameerror", "First Name not valid");
	                  }
	                  if(!validLastName) {
	              		request.setAttribute("lastnameerror",  "Last Name not valid");
	                  }
	                  if(!validEmail) {
	              		request.setAttribute("emailerror",  "Email not valid");

	                  }
	                  if(!validSalary) {
	              		request.setAttribute("salaryerror",  "Salary not valid");

	                  }
	                  if(emailExist) {
	                		request.setAttribute("emailexisterror",  "Email already exist");

	                  }     
	                          
	                  RequestDispatcher dispatcher=
	          				request.getRequestDispatcher("registrationform.jsp");	                  
	          		List<RetriveEmployeeDesignationModel> designationList=hrservice.retrieveDesignation();
	          		request.setAttribute("designationList",designationList);
	          		dispatcher.forward(request,response);
	              	}
	        	
	        	else {
	        		InsertEmployeeModel insertEmployeeModel=new InsertEmployeeModel();
	        		insertEmployeeModel.setEmployeeId(employeeId);
	        		insertEmployeeModel.setFirstName(firstName);
	        		insertEmployeeModel.setLastName(lastName);
	        		insertEmployeeModel.setEmail(email);
	        		insertEmployeeModel.setPhoneNumber(phoneNumber);
	        		insertEmployeeModel.setHireDate(hireDate);
	        		insertEmployeeModel.setSalary(salary);
	        		insertEmployeeModel.setDateOfBirth(dateOfBirth);
	        		insertEmployeeModel.setDesignation(designation);
	        		insertEmployeeModel.setJobLocation(jobLocation);
	              		String outcome=hrservice.employeeInsert(insertEmployeeModel);
	              		if(outcome.contentEquals("success")) {
	              			 RequestDispatcher dispatcher=
	              	    				request.getRequestDispatcher("employeesuccess.jsp");
	              			 request.setAttribute("insertEmployeeModel",insertEmployeeModel);
	                 			 request.setAttribute("operation", "Below Employee record Registration was Successfully");

	              	    		dispatcher.forward(request,response);
	              		}else {
	              			 RequestDispatcher dispatcher=
	              	    				request.getRequestDispatcher("employeefail.jsp");
	                 			 request.setAttribute("operation", "Employee Registration Failed");

	              	    		dispatcher.forward(request,response);
	              		}
		 }
		
	}	 	 

	}
}
