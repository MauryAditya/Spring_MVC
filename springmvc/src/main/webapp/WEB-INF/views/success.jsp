<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%String s=(String) request.getAttribute("name"); %>
<%= s %> --%>
 
 <h3>My name is ${users.name }</h3>
<br>
<h3>My email  is ${users.email }</h3>
<br>
<h3>My passwored  is ${users.password }</h3>

<%--  <h3>My name is ${name }</h3>
<br>
<h3>My email  is ${email }</h3>
<br>
<h3>My passwored  is ${password }</h3>  --%>
</body>
</html>