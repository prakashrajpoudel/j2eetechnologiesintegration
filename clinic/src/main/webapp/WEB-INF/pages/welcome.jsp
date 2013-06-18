<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sample</title>
</head>
<body>
<%! static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(welcome_jsp.class); %>
<% java.util.Date d = new java.util.Date(); %>
<h1>
Sample page and Today's date is <%= d.toString() %> and this jsp page worked!
<% logger.warn( "Loged in Welcome File");  %>
</h1>
</body>
</html>