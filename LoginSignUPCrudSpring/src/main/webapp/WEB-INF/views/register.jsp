<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="/LoginRegister" method="post"
		modelAttribute="customer">
		<table
			style="background-color: Lightgreen; margin-left: 20px; margin-left: 20px;">

			<tr>
				<td><h3 style="color: red;">Registration Page...!!!</h3></td>
			</tr>
			<tr>
				<td>UserNmae:</td>
				<c:choose>
					<c:when test="${not empty customer.username}">

						<form:hidden path="username"></form:hidden>
					</c:when>
					<c:otherwise>
						<td><form:input type="text" path="username" name="username" /></td>
					</c:otherwise>

				</c:choose>

			</tr>
			<tr>
				<td>Name::</td>
				<td><form:input type="text" path="name" name="name" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input type="password" path="password" name="password" /></td>
			</tr>

			<tr>
				<td><input type="submit" name="submit" value="Register"></td>
				<td><a href="/customer">View Customer details</a></td>
				<td></td>
			</tr>
		</table>
	</form:form>
</body>
</html>