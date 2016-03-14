<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
    
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exception Handler</title>

</head>
<body>
	<h1>Exception Handler</h1>
	Exception Message : <%= exception.getMessage() %>
	Exception Class : <%= exception.getClass() %>
</body>
</html>