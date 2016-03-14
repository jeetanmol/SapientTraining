<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

<h1>Login Details</h1>
	<form method='post' action="login.jsp">
	User Name: 
	<input type="text" name="userName">
	Password :
	<input type="password" name="password">
	<input type="submit" value="Submit"  >
	</form>

	
</body>

</html>