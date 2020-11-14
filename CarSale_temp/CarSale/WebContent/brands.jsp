<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<%@include file="WEB-INF/header.jsp"%>
	<div class="row">
		<div class= "jumbotron">
			<h1>Input Brands</h1>
			<form action="login" method= "post">
				
				<label>Name</label>
					<input type="text" name="name" class="form-control">
				<label>Brand</label>
					<input type="text" name="brand" class="form-control">
				
					<input type="reset" class="btn btn-primary" value="Cancel">
					<input type="submit" class="btn btn-success" value="Submit">		
			</form>
		</div>
	</div>
</div>
<%@include file="WEB-INF/Footer.jsp"%>
</body>
</html>