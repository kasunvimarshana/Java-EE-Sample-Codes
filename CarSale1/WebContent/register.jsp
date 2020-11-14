<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
   <%@include file="WEB-INF/header.jsp" %>
    <div class="row">
    
    <div class="jumbotron">
    <h1>Registration Page</h1>
   <form action="RegisterServlet" method= "POST">
				<label>Name</label>
					<input type="text" name="name" class="form-control">
				<label>Email</label>
					<input type="text" name="email" class="form-control">
				<label>Phone</label>
					<input type="text" name="tp" class="form-control">
				<label>Password</label>
					<input type="password" name="pw" class="form-control">
				<label>Confirm</label>
					<input type="password" name="confirm" class="form-control">

					
					<input type="submit" class="btn btn-success" value="register">
					<a href="login.jsp.jsp" class="btn btn-info ">Login</a>
					<input type="reset"class="btn btn-warning" value="cancel">
	</form>
    
  </div>
   
</div>
</div>
<%@include file="WEB-INF/footer.jsp"%>
</body>
</html>