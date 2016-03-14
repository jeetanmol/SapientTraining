<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>

Welcome ${req.customerName} <br>

<ul>

	<li><a href="">View Booking</a>
	<li><a href="">Delete Booking</a>
	<li><a href="">Payment History</a>
		
</ul>

<section>
	<form action="cust/check">
	Enter your Name: <input type="text" name="userName">
	<input type="submit" value="Search">
	</form>
	
	
	${prevBooking}
</section>
</body>
</html>