<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% request.setAttribute("city", "mansa"); %>
<% session.setAttribute("username", "Anmol");%>
<% application.setAttribute("village", "hodla kalan");%>

<div style="text-align: right">Welcome: <%= session.getAttribute("username") %>
</div>
New Session: <span style="color: red"> <%= session.isNew() %></span>

Session Id: <span style="color: red"> <%= session.getId() %></span>

<a href="FirstServlet">Continue</a>

</body>
</html>