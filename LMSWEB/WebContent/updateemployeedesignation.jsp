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
<form method="post" action="Hrservlet?action=updatedesignation">
<table>
<tr>
<td><label for="employeeId">Employee Id:</label></td>
<td><input type="number" name="employeeId" value="${retriveemployeemodel.employeeId}" readonly="readonly"/></td>
</tr>

<tr>
<td><label for="designation"> Designation:</label></td>
<td>
<select name="designation">
<c:forEach items="${designationList}" var="designationmodel">
<option value="${designationmodel.designation}"><c:out value="${designationmodel.designation}"/></option>
</c:forEach>
</select>
</td>
</tr>



<tr>
<td><input type="submit" value="Update" class="button"></td>
<td><input type="reset" value="Cancel" class="button"/></td>
</tr>



</table>
</form>
</body>
</html>