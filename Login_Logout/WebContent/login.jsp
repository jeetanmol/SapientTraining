<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<c:set var="user" value="${param.userName}" scope="application"></c:set>
<c:set var="pass" value="${param.password}" scope="application"></c:set>

<c:if test="${user eq 'anmol' && pass eq '12345' }">
	<c:set scope="session" value="${user }" var="userName" ></c:set>
	<c:redirect url="First.jsp"></c:redirect>
</c:if>

<c:if test="${!(user eq 'anmol' && pass eq '12345') }">

<c:redirect url="index.jsp"></c:redirect>
</c:if>
</body>
</html>