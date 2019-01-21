<%@page import="bean.Player"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>FoundTeam</title>
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
	.table{
  		border: 1px solid black;
	}
	th, td {
  		border: 1px solid black;
  		text-align: center;
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
		<h2 style="color: #06adff;">Success!!!!!!!</h2>
		<% String msg = (String)request.getAttribute("msg"); %>
		<h5><b><%= msg %></b></h5>
		<% ArrayList<Player> list = (ArrayList<Player>)request.getAttribute("ArrayList"); %>
<table class="table">
	<tr>
		<th>S.No</th>
		<th>PlayerId</th>
		<th>PlayerName</th>
		<th>Age</th>
		<th>Position</th>
		<th>Team</th>
		<th>Salary</th>
		<th>Rating</th>
	</tr>
	<%! int i=1; %>
	<% for (Player emp : list){%>
	<tr>
		<td><%= i %>.</td>
		<td><%= emp.getPlayerId() %></td>
		<td><%= emp.getPlayerName() %></td>
		<td><%= emp.getAge() %></td>
		<td><%= emp.getPosition() %></td>
		<td><%= emp.getTeam() %></td>
		<td><%= emp.getSalary() %></td>
		<td><%= emp.getRating() %></td>
		<% i++; %>
	</tr>	
		<% } %>
</table>	
		
		<input id="button" type="submit" class='my-button' name="action" value="HOME">
</div>
</center>
</form>
</body>
</html>