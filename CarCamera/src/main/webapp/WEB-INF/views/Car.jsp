<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Camera Details</title>
</head>
<body>
	<form action="/cameradetails" method="get">
		<h1>Enter Your Camera ID</h1>
		<table>

			<tr>
				<input type="text" path="cameraId" name="cameraId">
			</tr>

			<tr>
				<input type="submit" name="submit" value="Enter">
			</tr>
		</table>

	</form>
	<table>
		<tr>
			<th>Camera Name</th>
			<th>Store Name</th>
			<th>Miko Name</th>
		</tr>
		<tbody>
			<tr>
				<td>${cameraName}</td>
				<td>${storeName}</td>
				<td>${mikoName}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>