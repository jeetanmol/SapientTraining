<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Authentication</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
	
	
	<c:set var="userName" value="${param.userName }" scope="session"></c:set>
	<c:set var="password" value="${param.password }" ></c:set>
	<c:set var="role" value="${param.role }" scope="session"></c:set>
	<c:set var="labCode" value="${param.labCode }" scope="session"></c:set>
	
	
	

</body>
</html>