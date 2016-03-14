<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My First Scriptless JSP</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<c:set var="name" value="Welcome to JSP Programming" scope="page"></c:set>
<span style="color: red;"><c:out value="${name }"></c:out></span>

<a href="NamesServlet">Print Students</a>
	
</body>
</html>