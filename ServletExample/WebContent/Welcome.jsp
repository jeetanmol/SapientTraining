<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java Server Pages</title>
</head>
<body>

<%-- I am a JSP comment --%>

<%! String title="Welcome to JSP Programming "; %>


<!-- Expression (HTML comment) -->

<div style="text-align: center">
<%= title %>
</div>
<%-- Implicit Object & local Variable --%>
<%
String author="Ramesh";
out.println("Designed by " +author);

%>

</body>
</html>