<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<c:if test="${empty sessionScope.userName }">
	<c:redirect url="index.jsp"></c:redirect>
</c:if>
<a href="Logout.jsp">Logout <c:out value="${sessionScope.userName }"></c:out></a>
</body>
</html>