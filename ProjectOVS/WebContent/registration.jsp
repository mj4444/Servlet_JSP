<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="jquery-3.4.1.js"></script>
<link rel="stylesheet" type="text/css" href="index.css">
<link rel="stylesheet" type="text/css" href="form.css">
<title>Registration</title>
</head>
<body>
	
	<form name="registration" action="RegistrationServlet" method="post" class="container">
		<input type="text" name="id" placeholder="Enter ID" autocomplete="off" required /><br/>
		<input type="text" name="name" placeholder="Enter Name" autocomplete="off" required /><br/>
		<input type="date" name="dob" placeholder="Enter DOB" autocomplete="off" required />
		<input type="text" name="contactNo" placeholder="Enter Contact Number" autocomplete="off" required /><br/>
		<input type="email" name="email" placeholder="Enter Email" autocomplete="off" required /><br/>
		<input type="password" name="password" placeholder="Enter Password" autocomplete="off" required /><br/>
		<input type="text" name="houseNo" placeholder="Enter House No." autocomplete="off" required /><br/>
		<input type="text" name="street" placeholder="Enter Street" autocomplete="off" required /><br/>
		<input type="text" name="block" placeholder="Enter Block" autocomplete="off" required /><br/>
		<input type="text" name="district" placeholder="Enter District" autocomplete="off" required /><br/>
		<input type="text" name="city" placeholder="Enter City" autocomplete="off" required /><br/>
		<input type="text" name="state" placeholder="Enter State" autocomplete="off" required /><br/>
		<input type="text" name="country" placeholder="Enter Country" autocomplete="off" required /><br/>
		<input type="submit" value="Register" id="regButton" />
	</form>

</body>
</html>