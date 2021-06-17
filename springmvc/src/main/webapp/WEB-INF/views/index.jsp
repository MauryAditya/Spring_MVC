<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ page import ="java.util.ArrayList"%>
	<%@ page import ="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hello web mvc</h1>
		<% 
		String name=(String)request.getAttribute("name");
		Integer id=(Integer)request.getAttribute("id");
		List<String> friends=(List<String>)request.getAttribute("f");
		%>
		name is	<%= name+"  "+"Id is "+id %>
		
		<%
		for(String s:friends){
			out.println(s);
		}
		%>
		
</body>
</html>