<%@page import="com.dev.spring.mvc.dto.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Study Hard Icompass is coming</h1>
<% Person p = (Person)request.getAttribute("person");
%>
<h1><%=p.getName() %></h1>
<h1><%=p.getMail() %></h1>
<h1><%=p.getUserid() %></h1>
<h1><%=p.getPhonenumber() %></h1>
</body>
</html>