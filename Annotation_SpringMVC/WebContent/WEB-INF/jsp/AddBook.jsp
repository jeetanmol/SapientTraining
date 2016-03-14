<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
</head>
<body>

<form:form action="addBook.htm" method="POST">

	<label>Book Number : </label>
	<form:input path="bookNumber"/>
	
	<label>Book Name : </label>
	<form:input path="bookName"/>
	
	<label>Book Author : </label>
	<form:input path="author"/>
	<br>
	<label>ISBN :
	<label>Group : </label>
	<form:input path="isbnCode.group"/>
	
	<label>Publisher :</label>
	<form:input path="isbnCode.publisher"/>
	
	<label>Title : </label>
	<form:input path="isbnCode.title"/></label>
	<form:select path="subject" items="${subjectCode }"></form:select>
	<input type="submit" value="Add Book">

</form:form>
</body>
</html>