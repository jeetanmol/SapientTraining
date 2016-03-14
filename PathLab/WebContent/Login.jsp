<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" href="css/styles.css" rel="stylesheet"></link>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<body>
<%@ include file="Header.jsp" %>

<form action="loginauth.jsp" method="post">

<div class="main" >
	<table >
	
   <fmt:setLocale value="${param['locale'] }"/>
   <fmt:setBundle basename="MessageResources" var="msg" scope="application"/>
	<tr>
		<td><label><fmt:message key="forms.label.role" bundle="${msg }"></fmt:message> :</label></td>
		<td><select name="role">
			<option value="admin">Administrator</option>
			<option value="mgr">Manager</option>
			<option value="tech">Technician</option>
			<option value="opr">Lab Operator</option>
		</select>
		</td>
	</tr>
	<tr>
		<td><label><fmt:message key="forms.label.labCode" bundle="${msg }"></fmt:message> :</label></td>
		<td>
		<input type="text" list="labCode" name="labCode">
		<datalist id="labCode" ></datalist>
		</td>
	</tr>
	
	<tr>
		<td><label><fmt:message key="forms.label.userId" bundle="${msg }"></fmt:message> :</label></td>
		<td><input type="text" name="userName"></td>
	</tr>
	<tr>
		<td><label><fmt:message key="forms.label.password" bundle="${msg }"></fmt:message> </label></td>
		<td><input type="password" name="password"></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="<fmt:message key="forms.label.userId" bundle="${msg }"></fmt:message> "></td>
	</tr>
	
	</table>
</div>
</form>


<%@ include file="Footer.jsp" %>
</body>
</html>