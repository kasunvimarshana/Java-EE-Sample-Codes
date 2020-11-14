<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.im.ws.CalculatorServiceLocator" %>
<%@page import="com.im.ws.Calculator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Result Page </h1>
<hr/>

<%

 String n1 = request.getParameter("num1");
 String n2 = request.getParameter("num2");
 
 double num1 = Double.parseDouble(n1);
 double num2 = Double.parseDouble(n2);
 
 /*
 to use the web servise we need to create stub of the service
 right click on the "src" package
 new -> other -> web services -> web service client -> next -> 
 give the service definition (http://localhost:8080/WebServiceEx/services/Calculator?wsdl)
 WSDL = web service definition language
 next and finish
 */
 
 CalculatorServiceLocator locator = new CalculatorServiceLocator();
 Calculator cal = locator.getCalculator();
 double result = cal.add(num1 , num2);

%>

<h3> Num 1 = <%=num1 %></h3>
<h3> Num 2 = <%=num2 %></h3>
<h3> Result = <%=result %></h3>

</body>
</html>