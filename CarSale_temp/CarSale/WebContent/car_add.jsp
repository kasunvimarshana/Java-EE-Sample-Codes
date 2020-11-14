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
			<h1>Post Your Car</h1>
			<form action="add" method= "post">
				<label>Name</label>
					<input type="text" name="name" class="form-control">
				<label>Brand</label>
					<select name ="brand" class="form-control">
					<option> </option>
					</select>
				<label>Milage</label>
					<input type="text" name="milage" class="form-control">
				<label>Price</label>
					<input type="text" name="price" class="form-control">
				<label>Photo</label>
					<input type="file" name="photo" class="form-control">
				<label>Description</label>
					<textarea name="text" name="description" class="form-control">
					Type Description Here
					</textarea>
				
					<input type="reset" class="btn btn-warning" value="Cancel">
					<input type="submit" class="btn btn-success" value="Upload">
					
			</form>
		</div>
	</div>
</div>
<%@include file="WEB-INF/Footer.jsp"%>
</body>
</html>