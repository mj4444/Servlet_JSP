<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="jquery-3.4.1.js"></script>
<script type="text/javascript" src="page.js"></script>
<link rel="stylesheet" type="text/css" href="index.css">
<link rel="stylesheet" type="text/css" href="form.css">
<title>Login</title>
</head>
<body>

	<form name="loginForm" action="LoginServlet" method="post" class="container">
		<input type="text" name="email" title="Enter Email" placeholder="Email" autocomplete="off" required /><br />
		<input type="password" name="password" title="Enter Password" placeholder="Password" autocomplete="off" required /><br />
		<input type="submit" id="loginButton" value="Login" />
	</form>
	
	<div class="regLink">
		Don't have an account.
		<a href="registration.jsp">REGISTER</a> here.
	</div>

	<script type="text/javascript">
	</script>
	
</body>
</html>