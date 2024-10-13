<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2><%= request.getAttribute("message") %></h2>
    <a href="deleteEmployee.html">Delete Another Employee</a>
    <a href="viewAll">View All Employees</a>
</body>
</html>