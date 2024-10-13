<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Update Result</title>
</head>
<body>
    <h2>Update Result</h2>
    <%
        String message = (String) request.getAttribute("message");
        out.println(message);
    %>
    <a href="updateEmployee.html">Update Another Employee</a>
    <a href="viewAll">View All Employees</a>
</body>
</html>