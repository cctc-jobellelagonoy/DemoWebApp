<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.training.web.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses</title>
</head>
<body>
	<h2>List of Courses</h2>
	<table border="1">
		<tr>
			<th>ID</td>
			<th>Course Name</td>
			<th>Duration (days)</td>
			<th>Fee</td>
		</tr>
	  <c:forEach items="${courses}" var="c">
	   <tr>
	   	 <td>${c.id}</td>
	     <td>${c.name}</td>
	     <td>${c.durationDays}</td>
	     <td>${c.fee}</td>
	   </tr>
	  </c:forEach>
	</table>
</body>
</html>