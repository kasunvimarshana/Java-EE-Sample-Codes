<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="header.jsp"%>

<h2>Register</h2>

<form action="register" method="POST">

	<label>Name</label><br/>
	<input type="text" name="name"/><br/>
	
	<label>E-mail</label><br/>
	<input type="text" name="email"/><br/>
	
	<label>Phone</label><br/>
	<input type="text" name="phone"/><br/>
	
	<label>Address</label><br/>
	<input type="text" name="pw"/><br/>
	
	<input type="submit" value="register"/>

</form>

</body>
</html>