<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="com.cardekho.model.Car" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
</head>
<%!String loginLogout = "";
	String create = "";
	String flag = "";
	String search = "";
	String make = "";
	String model = "";
	String engineCC = "";
	String fuelCapacity = "";
	String mileage = "";
	int price = 0;
	int roadTax = 0;
	String ac = "";
	String powerSteering = "";
	String accessoryKit = "";
	String imagePath = "";
	String buttonName = "";
	String type = "";%>
<%
	if (session.getAttribute("user") == null) {
		loginLogout = "Login";
		create = "";
		flag = "";
		search = "Search";
	} else {
		loginLogout = "Logout";
		create = "Create";
		flag = "/";
		search = "View";
	}

	if (request.getAttribute("Vehicle") == null) {
		make = "";
		model = "";
		engineCC = "";
		fuelCapacity = "";
		mileage = "";
		price = 0;
		roadTax = 0;
		powerSteering = "";
		ac = "";
		accessoryKit = "";
		buttonName = "Create";
		type = "create";
	} else {
		Car car = (Car) request.getAttribute("Vehicle");
		make = car.getMake();
		model = car.getModel();
		engineCC = car.getEngineCC();
		fuelCapacity = car.getFuelCapacity();
		mileage = car.getMileage();
		price = car.getPrice();
		roadTax = car.getRoadTax();
		ac = car.getAC();
		powerSteering = car.getPowerSteering();
		accessoryKit = car.getAccessoryKit();
		imagePath = car.getImagePath();
		buttonName = "Update";
		type = "update";
	}
%>

<body>
	<header>
	<div id="logo">
		<img src="images/car logo2.png" alt="Car Logo" />
	</div>
	<div id="logo2">
		<img src="images/car logo.jpg" alt="Car Logo" />
	</div>
	<div id="login">
		<a href="LoginServlet"><%=loginLogout%></a> / <a href="Search"><%=search%></a>
		<%=flag%>
		<a href="Create"><%=create%></a>
	</div>
	<div id="socialMedia">
		<ul>
			<li class="socialMediaLogo"><a href="javascript:;"><img
					src="images/facebook.png" /></a></li>
			<li class="socialMediaLogo"><a href="javascript:;"><img
					src="images/twitter.png" /></a></li>
			<li class="socialMediaLogo"><a href="javascript:;"><img
					src="images/linkedIn.png" /></a></li>
			<li class="socialMediaLogo"><a href="javascript:;"><img
					src="images/googlePlus.png" /></a></li>
		</ul>
	</div>
	</header>
	<nav>
	<ul>
		<li class="navBar"><a href="Home">Home</a></li>
		<li class="navBar"><a href="AboutUs">About Us</a></li>
		<li class="navBar"><a href="ContactUs">Contact Us</a></li>
		<li class="navBar"><a href="Careers">Careers</a></li>
	</ul>
	</nav>
	<div class="section">
		<div id="create">
			<form action="Create" method="post">
				<table>
					<caption>Create</caption>
					<tr>
						<td>Make :</td>
						<td><input class="text" type="text" name="make" id="make"
							pattern="[a-z/A-Z]+" title="Only letters and numbers are allowed"
							placeHolder="Enter Make" required value="<%=make%>" /></td>
					</tr>
					<tr>
						<td>Model :</td>
						<td><input class="text" type="text" name="model" id="model"
							pattern="[a-z/A-Z]+" title="Only letters and numbers are allowed"
							placeHolder="Enter Model" required value="<%=model%>" /></td>
					</tr>
					<tr>
						<td>Engine CC :</td>
						<td><input class="text" type="number" name="engineCC"
							id="engineCC" placeHolder="Enter Engine CC" min="500" max="5000"
							required value="<%=engineCC%>" /></td>
					</tr>
					<tr>
						<td>Fuel Capacity :</td>
						<td><input class="text" type="number" name="fuelCapacity"
							id="fuelCapacity" placeHolder="Enter FuelCapacity" min="40"
							max="65" required value="<%=fuelCapacity%>" /></td>
					</tr>
					<tr>
						<td>Mileage :</td>
						<td><input class="text" type="number" name="mileage"
							id="mileage" placeHolder="Enter mileage" min="5" max="30"
							required value="<%=mileage%>" /></td>
					</tr>
					<tr>
						<td>Price :</td>
						<td><input class="text" type="number" name="price" id="price"
							placeHolder="Enter Price" min="150000" required
							value="<%=price%>" /></td>
					</tr>
					<tr>
						<td>Road Tax(in %) :</td>
						<td><input class="text" type="number" name="roadTax"
							id="roadTax" placeHolder="Enter RoadTax in % of Price" min="8"
							max="20" required value="<%=roadTax%>" /></td>
					</tr>
					<tr>
						<td>AC Availability:</td>
						<td><select class="text" name="ac" id="ac" required>
								<option value="" <%if (ac.equals("")) {%>
									selected <%}%>>-- Select --</option>
								<option value="Yes"
									<%if (ac.equalsIgnoreCase("YES")) {%> selected
									<%}%>>YES</option>
								<option value="No"
									<%if (ac.equalsIgnoreCase("NO")) {%> selected
									<%}%>>NO</option>
						</select></td>
					</tr>
					<tr>
						<td>Power Steering Availability:</td>
						<td><select class="text" name="powerSteering"
							id="powerSteering" required>
								<option value=""
									<%if (powerSteering.equals("")) {%> selected
									<%}%>>-- Select --</option>
								<option value="Yes"
									<%if (powerSteering.equalsIgnoreCase("YES")) {%>
									selected <%}%>>YES</option>
								<option value="No"
									<%if (powerSteering.equalsIgnoreCase("NO")) {%>
									selected <%}%>>NO</option>
						</select></td>
					</tr>
					<tr>
						<td>Accessory Kit Availability:</td>
						<td><select class="text" name="accessoryKit"
							id="accessoryKit" required>
								<option value=""
									<%if (accessoryKit.equals("")) {%> selected
									<%}%>>-- Select --</option>
								<option value="Yes"
									<%if (accessoryKit.equalsIgnoreCase("YES")) {%>
									selected <%}%>>YES</option>
								<option value="No"
									<%if (accessoryKit.equalsIgnoreCase("NO")) {%>
									selected <%}%>>NO</option>
						</select></td>
					</tr>
					<tr>
						<td>Select Image :</td>
						<td><input class="text" type="file" name="carimage"
							id="carimage" required value="images/<%=imagePath%>" /></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input class="submit"
							type="submit" name="createCarSubmit" id="createCarSubmit"
							value="<%=buttonName%>" onclick="validate()" /></td>
					</tr>
				</table>
				<input type="hidden" name="type" value="<%=type%>" /> <input
					type="hidden" name="id" value="<%=request.getAttribute("id")%>" />
			</form>
			<label color="White">${msg}</label>
		</div>

	</div>
	<footer>
	<p>&copy Copyright 2015. All Rights Reserved.</p>
	<ul>
		<li class="navBar"><a href="Home">Home</a></li>
		<li class="navBar"><a href="AboutUs">About Us</a></li>
		<li class="navBar"><a href="ContactUs">Contact Us</a></li>
		<li class="navBar"><a href="Careers">Careers</a></li>
	</ul>
	</footer>
</body>
</html>
