<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Employees</title>
</head>
<body>
	<form action="LoginRegister/edit" method="post" commandName="customer">
		<c:if test="${not empty customerList}">
			<table class="custTable">
				<tr>
					<th width="120">User Name</th>
					<th width="120">Name</th>
					<th width="120">Password</th>
				</tr>

				<c:forEach items="${customerList}" var="customer">
					<tr>
						<td>${customer.username}</td>
						<td>${customer.name}</td>
						<td>${customer.password}</td>
						<td align="center"><a
							href="/customer/register/edit/${customer.username}">Edit</a> | <a
							href="/customer/remove/${customer.username}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>

	</form>
</body>
</html>