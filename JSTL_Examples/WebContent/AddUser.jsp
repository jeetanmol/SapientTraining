<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formatting Tag</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
</head>
<body>
<fmt:setLocale value="fr"/>
<fmt:setBundle basename="MessageResources" var="msg"/>
<form >
	<label><fmt:message key="forms.label.userName" bundle="${msg }"/></label>
	<input type="text" name="userName">
	
	<label><fmt:message key="forms.label.password" bundle="${msg }"/></label>
	<input type="password" name="password">
	

</form>
</body>
</html>