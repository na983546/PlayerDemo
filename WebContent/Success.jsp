<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Success</title>
<style>
	*{
		margin:0px;
	}
	body {
		font-family: Arial, Helvetica, sans-serif;
	}
	#button:hover {
 		opacity: 0.8;
	}
	form {
		border: 3px solid #f1f1f1;
	}
	.my-button {
		padding: 15px 32px;
		background-color:#4CAF50;
		border-radius:15px;
		text-align: center;
		color:white;
		border-color:black;
		margin-top: 10px;
	}
	.field-label {
		text-align:left;
	}
	.container {
		margin :0 400px 0 400px;
 		padding: 16px;
 		background-color: grey;
	}
	header{
		height:100px;
		background-color:#001c58;
		color:white;
		padding:0px;
		margin: 0 0 0 0;
	}
</style>
</head>
<body style="background-color: #e3c6f0">
<header>
<div>
	<h1 style="text-align: center; font-weight: bold; font-size:50px;">HOCKEY INDIA</h1>
	<h5 style="text-align: center; font-weight: bold;">INDIA-PAKISTAN FRIENDLY</h5>
</div>
</header>
<h1 style="text-align: center">Player Management System</h1>
<form class="container" action="PlayerManager" method="post">
<center>
<div >
		<% String msg = (String)request.getAttribute("msg"); %>
		<h2 style="color: #06adff;">Success!!!!!!!</h2>
		<h5><b><%= msg %></b></h5>

		<input type="hidden" name ="action" value="HOME">
		<input id="button" type="submit" class='my-button' name="action" value="HOME">
</div>
</center>
</form>
</body>
</html>