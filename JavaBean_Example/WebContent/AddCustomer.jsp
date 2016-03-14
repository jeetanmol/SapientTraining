<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add customer</title>
</head>
<body>
<header>
	<%@ include file="Header.jsp" %>
</header>

<section>
	<form action="ProcessCustomer.jsp">
		<label>Customer Id: </label>
			<input type="text" name="customerId">
		<label>Customer Name: </label>
			<input type="text" name="customerName">
		<label>Email Id:</label>
			<input type="email" name="email">
		<label>Phone No.:</label>
			<input type="text" name="handPhone" placeholder="10 Digit PhoneNumber" >
			
			<input type="submit" value="Add">
	</form>
</section>

<footer>
	<jsp:include page="Footer.jsp" />
</footer>
</body>
</html>