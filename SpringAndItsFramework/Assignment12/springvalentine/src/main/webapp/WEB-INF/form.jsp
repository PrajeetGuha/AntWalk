<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Valentine Form</title>
</head>
<body bgcolor="#B51A3A">

    <form:form action="valentineInfo" modelAttribute="valentine">
	<table>
		<tr>
			<td>Date: </td>
			<td><form:input path="date" required="true" type = "date" /></td>
		</tr>
		
		<tr>
			<td>Gift: </td>
			<td><form:input path="gift" required="true" /></td>
		</tr>
		<tr>
			<td>Location: </td>
			<td><form:input path="location" required="true" /></td>
		</tr>
	</table>
	<input type="submit" value="submit">
</form:form>

</body>
</html>