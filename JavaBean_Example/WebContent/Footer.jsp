<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
<p>Designed by <%= application.getInitParameter("designer")%></p>
<p><%= application.getInitParameter("copyRight") %></p>
</div>


</body>
</html>