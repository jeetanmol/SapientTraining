<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Request</title>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>
<h1 align="center">Enter your Details</h1>
<form:form method="post" action="AddRequest">

<form:errors  path="*" />

	<table>
	<tr>
	<td><label>Customer Name</label>
	<td><form:input path="customerName"/>
	</tr>
	
	<tr>
	<td><label>Phone Number</label>
	<td><form:input path="phone"/>
	</tr>
	
	<tr>
	<td><label>Email Id</label>
	<td><form:input path="email"/>
	</tr>
	
	<tr>
	<td><label>Car Type</label>
	<td><form:select path="carType" items="${carTypes}"/>
	</tr>
	
	<tr>
	<td colspan="2"><input type="submit" value="Add">
	</tr>
	
	</table>
	
</form:form>
</body>
</html>