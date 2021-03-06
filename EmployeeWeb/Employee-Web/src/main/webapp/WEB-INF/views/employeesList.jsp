<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Employees</title>
</head>
<body>
	<h1>List Employees</h1>
	<h3>
		<a href="add.html">Add More Employee</a>
	</h3>
	<c:if test="${!empty employees}">
		<table align="left" border="1">
			<tr bgcolor="pink">
				<th align="center">EMP ID</th>
				<th align="center">EMP NAME</th>
				<th align="center">EMP AGE</th>
				<th align="center">EMP SALARY</th>
				<th align="center">ADDRESS</th>
			</tr>

			<c:forEach items="${employees}" var="employee">
				<tr>
					<td><c:out value="${employee.empId}" /></td>
					<td><c:out value="${employee.name}" /></td>
					<td><c:out value="${employee.age}" /></td>
					<td><c:out value="${employee.salary}" /></td>
					<td><c:out value="${employee.address}" /></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>
