<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*" %>
<%@ page import="com.training.web.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Welcome <%= request.getParameter("un") %></h1>
	<h2>List of Users</h2>
	<%
		List<User> list = (List<User>) request.getAttribute("users");
	%>
	<table>
        <thead>
            <tr>
                <th>Id</th>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>
        </thead>
        <tbody>
            <% for(int i = 0; i < list.size(); i++) {
                User u =  list.get(i);
            %>
            <tr>
                <td><%=u.getId()%></td>
                <td><%=u.getFirstName()%></td>
                <td><%=u.getLastName()%></td>
               </tr>
            <%
            };
            %>
        </tbody>
    </table>
</body>
</html>