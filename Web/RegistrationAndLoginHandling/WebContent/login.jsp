<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
<link href="css/style.css" rel="stylesheet" />
</head>
<body>
	<h1 align="center">Log in Form</h1>
	<div id="wrapper">
		<form method="get" action="ValidateLogIn">
			<!-- Table -->
			<table align="center">
				<!--Table Row  -->
				<tr>
					<!-- User NAme -->
					<td>User Name:</td>
					<td><input type="text" name="userid" /></td>
				</tr>
				<tr>
					<!-- Password -->
					<td>Password:</td>
					<td><input type="password" name="pwd" /></td>
				</tr>
			</table>
			<!-- Submit Button -->
			<p align="center">
				<input type="submit" name="submit" value="Login" />
			</p>
		</form>
		<p align="center" class="error">${param.message}</p>
		<p align="center"><a href="index.jsp">If New User,Click Here</a></p>
		
	</div>
</body>
</html>