<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listener Example</title>
</head>
<body>



<form action="SecondServlet">
	<span style="text-align: center">User Login</span>
	<table>
		<tr>
		<td> User Id:
		</td>
		<td><input type="text" name="userId"  ></td>
		</tr>
		
		<tr>
		<td> Password:
		</td>
		<td><input type="text" name="password"  ></td>
		</tr>
		
		<tr>
		<td> Role:
		</td>
		
		
		<td>
		<input type="radio" name="role" value="chef">Chef
		<input type="radio" name="role" value="waiter">Waiter
		<input type="radio" name="role" value="manager">Manager
		
		</td>
		</tr>
		<tr  >
		<td colspan="2">
		<input type="submit" value="submit" name="submit">
		</td>
		</tr>
	</table>

</form>

</body>
</html>