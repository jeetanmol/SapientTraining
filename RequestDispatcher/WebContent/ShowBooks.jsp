<%@page import="com.training.domain.BookManager"%>
<%@page import="com.training.entity.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.training.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Books</title>
</head>
<body>

<%
	HashMap<Long,Book> bookList = (HashMap<Long,Book>)request.getAttribute("foundBooks");
	
%>
<table>
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Author</th>
	<th>Price</th>
	
	</tr>
	<% for(Long id : bookList.keySet()){
		Book b = bookList.get(id); %>
	<tr>
		<td><%= b.getBookNumber()%>
		<td><%= b.getBookName() %>
		<td><%= b.getAuthor() %>
		<td><%= b.getPrice() %>
		
	</tr>	
<%} %>

</table>
</body>
</html>