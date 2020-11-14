<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.carsale.controller.DB"%>

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
				<%
				
					Connection con  = DB.getConnection();
					String sql = "SELECT * FROM brand";
					PreparedStatement ps = con.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
					while(rs.next()){
				
				%>
				<tr>
					<td><%=rs.getInt("id")%></td>
					<td><%=rs.getString("name")%></td>
					<td>
						<a href="brand_view.jsp?id=<%=rs.getInt("id")%>" class="btn btn-info">View</a>
						<a href="brand_edit.jsp?id=<%=rs.getInt("id")%>" class="btn btn-warning">Edit</a>
						<a href="brand_delete.jsp?id=<%=rs.getInt("id")%>" class="btn btn-danger">Delete</a>
					</td>
				</tr>
				
				<% } %>
			
			</table>
		
		<a href="car_add.jsp" class="btn btn-success btn-lg ">ADD +</a>
					
		</div>
	</div>
</div>
<%@include file="WEB-INF/footer.jsp"%>
</body>
</html>