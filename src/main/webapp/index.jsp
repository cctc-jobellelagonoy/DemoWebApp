<%@ page language="java" 
    contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
		<title>Login Page</title>
	</head>

	<body>
		<form action="LoginServlet">
			Username 		
			<input type="text" name="un"/><br>		
			Password
			<input type="text" name="pw"/><br>
			<input type="submit" value="Login">			
		</form>

		<form action="signup.jsp">
			<input type="submit" value="Sign Up">
		</form>
	</body>
</html>