<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*" %>
<%@ page import="com.training.web.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Welcome <%= request.getParameter("un") %></h1>
	
	Username: <c:out value = "${ param.un }"></c:out>
	
	<h2>List of Users</h2>
	<c:forEach items="${ users }" var="u">
		<p>${u.username}</p>
	</c:forEach>
    
</body>
</html>