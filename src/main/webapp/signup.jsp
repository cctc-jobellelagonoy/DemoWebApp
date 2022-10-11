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
		<form action="SignUp" method="POST">
			Username 		
			<input type="text" name="un"/><br>		
			Password
			<input type="text" name="pw"/><br>
			Firstname
			<input type="text" name="fn"/><br>
			Lastname
			<input type="text" name="ln"/><br>
			<input type="submit" value="Sign Up">			
		</form>
	</body>
</html>