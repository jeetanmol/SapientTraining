<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Header_Admin</title>
</head>
<link type="text/css" href="css/styles.css" rel="stylesheet"></link>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<body>
<header >

	<c:set  var="locale" value="en" scope="application"></c:set>
	
	
	<div class="title"><h1>Dr. Paul's  Path Labs</h1></div>
	
	<c:if test="${sessionScope.role eq  'admin' || sessionScope.Role eq  'mgr'}">
		<%@ include file="HeaderAdmin.jsp" %>
	</c:if>
	<c:if test="${sessionScope.role eq 'tech' }">
		<%@ include file="HeaderTechnician.jsp" %>
	</c:if>
	<c:if test="${sessionScope.role eq 'opr' }">
		<%@ include file="HeaderOpr.jsp" %>
	</c:if>
	
	
	<div class="lang">
	<a href="Login.jsp?locale=en">ENG</a>
	<a href="Login.jsp?locale=fr">FRN</a>
	<a href="Login.jsp?locale=de">GER</a>
	
	</div>
	
	</header>
</body>

<script type="text/javascript">


</script>
</html>