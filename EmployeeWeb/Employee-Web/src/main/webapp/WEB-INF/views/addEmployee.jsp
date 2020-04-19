<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="include.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Add Employee Data</h2>
	<form:form action="save.html" method="POST" modelAttribute="employee">
		<table align="center" border="2" bgcolor="pink">
			<tr>
				<td>Employee ID :</td>
				<td><form:input path="empId" /></td>
			</tr>
			<tr>
				<td>Employee Name :</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>Employee Age :</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>Employee Salary:</td>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td>Employee Address :</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Save" /></td>
			</tr>
		</table>
	</form:form>

	<c:if test="${not empty employees}">
		<table align="center" border="2">
			<tr bgcolor="pink">
				<th align="center">EMP ID</th>
				<th align="center">EMP NAME</th>
				<th align="center">EMP AGE</th>
				<th align="center">EMP SALARY</th>
				<th align="center">ADDRESS</th>
			</tr>
			<c:forEach items="${employees}" var="employee">
				<tr>
					<td>${employee.empId}</td>
					<td>${employee.name}</td>
					<td>${employee.age}</td>
					<td>${employee.salary}</td>
					<td>${employee.address}</td>
					<td align="center"><a href="edit.html?empId=${employee.empId}">Edit</a>|<a
						href="delete.html?empId=${employee.empId}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>

	</c:if>
</body>
</html>