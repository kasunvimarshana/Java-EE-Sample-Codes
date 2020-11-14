<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- load the taglib -->
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	
	<!-- use taglib -->
	<h2> Login Page </h2>
	<s:form action="login" method="post">
	
		<s:textfield name="un" label="User Name" size="20"></s:textfield>
		<s:textfield name="pw" label="Password" size="20"></s:textfield>
		<s:submit name="submit" label="Login" align="center"></s:submit>
	
	</s:form>
	
	<!-- 
	<h2> Login Page </h2>
	<form action="login" method="POST">
	
	<label>User Name</label><br/>
	<input type="text" name="un"/><br/>
	<label>Password</label><br/>
	<input type="password" name="pw"/><br/>
	<input type="submit" value="login"/>
	
	</form>
	-->
	
</body>
</html>