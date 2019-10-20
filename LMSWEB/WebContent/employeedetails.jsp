<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Employee Id</th><th>First Name</th><th>Last Name</th><th>Email</th><th>PhoneNumber</th><th>DateOfBirth</th><th>HireDate</th><th>Salary</th><th>Designation</th><th>JobLocation</th>
</tr>
<c:forEach items="${retriveEmployeeList}" var="retriveEmployeemodel">
<tr>
<td><c:out value="${retriveEmployeemodel.employeeId}"/></td>
<td><c:out value="${retriveEmployeemodel.firstName}"/></td>
<td><c:out value="${retriveEmployeemodel.lastName}"/></td>
<td><c:out value="${retriveEmployeemodel.email}"/></td>
<td><c:out value="${retriveEmployeemodel.phoneNumber}"/></td>
<td><c:out value="${retriveEmployeemodel.dateOfBirth}"/></td>
<td><c:out value="${retriveEmployeemodel.hireDate}"/></td>
<td><c:out value="${retriveEmployeemodel.salary}"/></td>
<td><c:out value="${retriveEmployeemodel.designation}"/></td>
<td><c:out value="${retriveEmployeemodel.jobLocation}"/></td>
</tr>
</c:forEach>
</table>
</body>
</html>