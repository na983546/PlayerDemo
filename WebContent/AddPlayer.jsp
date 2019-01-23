<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AddPlayer</title>
<script type="text/javascript" src="validate.js"></script>
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
<h3 style="text-align: center">Add New Player!!!!</h3>
<form class="container" name="myForm" action="PlayerServlet" method = "post" onclick="return validate()">
<center>
<div>
<table>
	<tr>
		<th class='field-label'>Player Id:</th>
		<td><input type ='text' name='playerId' id='playerId' ></td>
	</tr>
	<tr>
		<th class='field-label'>Player Name:</th>
		<td><input type ='text' name='playerName' id='playerName'></td>
	</tr>
	<tr>
		<th class='field-label'>Age:</th>
		<td><input type ='text' name='age' id='age'></td>
	</tr>
	<tr>
		<th class='field-label'>Position:</th>
		<td><select name='position' id='position'>
			<option value="-1" >Select Position</option>
			<option value="FORWARD">FORWARD</option>
			<option value="DEFENCE">DEFENCE</option>
			<option value="GOALKEEPER">GOALKEEPER</option>
			</select>
		</td>
	</tr>	
	<tr>
		<th class='field-label'>Team:</th>
		<td><input type="radio" name="team" value="INDIA" checked> INDIA</td>
  		<td><input type="radio" name="team" value="PAKISTAN"> PAKISTAN</td>
	</tr>
	<tr>
		<th class='field-label'>Salary:</th>
		<td><input type ='text' name='salary' id='salary'></td>
	</tr>
	<tr>
		<th class='field-label'>Ratings:</th>
		<td><select name='ratings' id='ratings'>
			<option value="-1" >Select Rating</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			</select>
		</td>
	</tr>
</table>
		<input id="button" type="submit" class='my-button' name="action" value="ADD PLAYER">
		<input id="button" type="reset" class='my-button' value="RESET">
		
</div>
</center>
</form>
</body>
</html>