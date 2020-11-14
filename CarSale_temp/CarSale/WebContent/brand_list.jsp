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
	<%@include file="WEB-INF/header.jsp"%>
	<div class="row">
		<div class= "jumbotron">
			<h1>Band List</h1>
			<table class= "table">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Options</th>
				</tr>
				<tr>
					<td>001</td>
					<td>Toyota</td>
					<td>
						<a href="brand_view.jsp" class="btn btn-info">View</a>
						<a href="brand_edit.jsp" class="btn btn-warning">Edit</a>
						<a href="brand_delete.jsp" class="btn btn-danger">Delete</a>
					</td>
				</tr>
			
			</table>
		
		<a href="car_add.jsp" class="btn btn-success btn-lg ">ADD +</a>
					
		</div>
	</div>
</div>
<%@include file="WEB-INF/Footer.jsp"%>
</body>
</html>