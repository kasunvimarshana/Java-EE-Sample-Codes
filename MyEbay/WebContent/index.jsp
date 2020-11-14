<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.im.myebay.db.DB"%>
<%@page import="com.im.myebay.model.Item"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/jquery-3.2.0.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h1> My Ebay </h1>
		<p> Buy or Sell </p>
		<hr/>
			<a href="login.jsp"> Login </a>
			<a href="register.jsp"> Register </a>
			<a href="item"> Sell Item </a>
		<hr/>
		
		<div>
			<% 
				List<Item> itemList = (List<Item>)DB.list("Item");
				for(Item item : itemList){
			%>
				
				<div class="col-md-4 well">
					<img class="img-thumbnail" alt="" src="uploads/<%=item.getPhotoFileName()%>"/>
					<h3> <%= item.getTitle() %> </h3>
					<p> Price: <%= item.getPrice() %> </p>
					<a href="#" class="btn btn-success">Add To Cart</a>
				</div>
					
			<%
			}
			%>
		</div>
		
	</div>

</body>
</html>