<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student List</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

<h1>Student List</h1>
<table>
<c:forEach items="${requestScope.namesList }" var="stud">
	<tr>
	<td>
	<c:if test="${stud.contains('a' )}">
	<b><c:out value="${stud }"></c:out></b>
	</c:if>
	<c:if test="${!stud.contains('a')}">
	<c:out value="${stud }"></c:out>
	</c:if>
	</tr>
</c:forEach>
</table>
</body>
</html>