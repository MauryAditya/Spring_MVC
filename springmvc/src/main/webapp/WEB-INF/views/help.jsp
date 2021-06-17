<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import =" java.time.LocalDateTime"  %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
     <!--  for expression language -->
 <%@page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>help page</h1>
<%--  <% String name=(String)request.getAttribute("name"); 
	LocalDateTime time=(LocalDateTime)request.getAttribute("time");
 %> 
<%=  name  %>
<%= time.toString() %>  --%>
 <h1>name is : ${name}</h1>
<h1>date and time : ${time}</h1> 
<hr>
<c:forEach var="item" items="${number }">
<h1><c:out value="${item }"></c:out></h1>
</c:forEach>
</body>
</html>