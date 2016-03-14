<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="ExceptionHandler.jsp"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Using Java Beans</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
	<jsp:useBean id="custBean" class="com.training.beans.Customer" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="custBean"/>
	Dear : <jsp:getProperty property="customerName" name="custBean"/> thanks for adding.
	
	
	
	Invoking Bean Method:
	<c:out value="${custBean.getInfo() }"></c:out>
</body>
</html>

