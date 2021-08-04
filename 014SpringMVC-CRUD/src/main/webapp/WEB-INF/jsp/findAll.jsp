<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Find All</h1>
	<span style="color: green;">${saveMsg}</span>

	<table>
		<tr>
			<td>Eid</td>
			<td>Ename</td>
			<td>Esal</td>
		</tr>
		<c:forEach items="${employees}" var="employee">
		<tr>
			<td><c:out value="${employee.eid}"></c:out></td>
			<td><c:out value="${employee.ename}"></c:out></td>
			<td><c:out value="${employee.esal}"></c:out></td>
			<td><a href="./updateEmp?eid=${employee.eid}">Update</a></td>
			<td><a href="./deleteEmp?eid=${employee.eid}">Delete</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>