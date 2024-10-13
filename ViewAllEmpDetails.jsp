<%@ page language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="test.EmpBean,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Details</title>
</head>
<body>
    <%
        List<EmpBean> employeeList = (List<EmpBean>) request.getAttribute("employeeList");
    if(employeeList.size()==0)
    {
    out.println("Employees list are not available<br>");
    }
    else
    {
    Iterator<EmpBean> it=employeeList.iterator();
    while(it.hasNext())
    {
   EmpBean bb=(EmpBean)it.next();
    out.println(bb.getId()+"&nbsp&nbsp"+bb.getName()+"&nbsp&nbsp"+bb.getSalary()+"&nbsp&nbsp"+bb.getAddress()+"nbsp&nbsp");
    }
    }
    %>
    <%@include file="input.html" %>
    </body>
    </html>