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
	<form action="viewcar" method= "get">
	
	<label>Photo</label><br>
					
	<label>Name</label><br>
					
	<label>Brand</label><br>
					
	<label>Milage</label><br>
	<label>Price</label><br>
					
				
	<label>Description</label><br>
					
					
	</form>
</div>
	<a href="brand_list.jsp" class="btn btn-info btn-lg">Back</a>
			
	<%@include file="WEB-INF/Footer.jsp"%>		
</body>
</html>