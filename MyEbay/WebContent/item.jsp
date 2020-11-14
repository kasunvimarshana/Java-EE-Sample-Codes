<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1> My Ebay </h1>
	<p> Buy or Sell </p>
	<hr/>
		<a href="login.jsp"> Login </a>
		<a href="register.jsp"> Register </a>
		<a href="item"> Sell Item </a>
	<hr/>
	
	<h2> Item Manager </h2>
	
<s:form action="add" method="POST" enctype="multipart/form-data">
	<s:textfield name="item.title" label="Title"></s:textfield>
	<s:textfield name="item.description" label="Description"></s:textfield>
	<s:textfield name="item.price" label="Price"></s:textfield>
	<s:textfield name="item.date" label="Date"></s:textfield>
	<s:file name="item.photo" label="Photo"></s:file>
	<img src="uploads/<s:property value="item.photoFileName"/>"/>
	<s:submit value="Save"></s:submit>
</s:form>

	
	<hr/>
	
	<table>
		<tr> <th>Image</th><th>Title</th><th>Description</th><th>Price</th><th>Date</th>
		</tr>
		<s:iterator value="itemList" var="item">
			<tr>
				<td><img src="uploads/<s:property value="photoFileName"/>" width="100px" height="100px"/></td>
				<td><s:property value="title"/></td>
				<td><s:property value="description"/></td>
				<td><s:property value="price"/></td>
				<td><s:property value="date"/></td>
			</tr>
		</s:iterator>
	</table>
	
</body>
</html>