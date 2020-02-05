<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="jquery-3.4.1.js"></script>
<title>Registration</title>
</head>
<body>
	<form name="registrationForm" action="RegistrationServlet" method="post">
		<input type="text" name="name"/><br/>
		<input type="password" name="password"/><br/>
		<input type="submit" id="regButton" value="Register"/>
	</form>
	
	<script type="text/javascript">
		$(document).ready(function(){
			console.log("Jquery");
			$('form').each(function(){
				console.log($(this).find(':input'));
			});
		});
	</script>
</body>
</html>