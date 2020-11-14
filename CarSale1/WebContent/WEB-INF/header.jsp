<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

<div class="content">
	<%
	if(session.getAttribute("role") != null){
		String role = session.getAttribute("role").toString();
		if(role.equals("user")){
			out.println(" <a href='login.jsp' class='btn btn-info '>Post Your Car</a> ");
		}else if(role.equals("admin")){
			out.println(" <a href='brands.jsp' class='btn btn-info '>Brands</a> ");
			out.println(" <a href='member_list.jsp' class='btn btn-info '>Members</a> ");
		}
		out.println(" <a href='brand_list.jsp' class='btn btn-info '>Brand List</a> ");
		out.println(" <a href='car_add.jsp' class='btn btn-info '>Car Add</a> ");
	%>
		<a href="logout" class="btn btn-success">Logout</a>
	<%
	}else{
	%>
	<a href="login.jsp" class="btn btn-info ">Login</a>
	<a href="register.jsp" class="btn btn-success ">Register</a>
	<%
	}
	%>
 	<img src="img/image.jpg" class="img-rounded" alt="CAR BANNER" width="100%" height="550" />
 </div>