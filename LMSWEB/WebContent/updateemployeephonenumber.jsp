<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<form method="post" action="Hrservlet?action=updatephonenumber">
<table>
<tr>
<td><label for="employeeId">Employee Id:</label></td>
<td><input type="number" name="employeeId" value="${retriveemployeemodel.employeeId}" readonly="readonly"/></td>
</tr>

<tr>
<td><label for="phoneNumber">New PhoneNumber:</label></td>
<td><input type="number" name="newPhoneNumber" value="${retriveemployeemodel.phoneNumber}" /></td>
</tr>

<tr>
<td><input type="submit" value="UpdatePhonenumber" class="button"></td>
<td><input type="reset" value="Cancel" class="button"/></td>
</tr>



</table>
</form>
</body>
</body>
</html>