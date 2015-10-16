<%@page import="com.modal.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Html Tag -->
<html>
	<!-- Head tag -->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Employee Details Page </title>
		<link rel="stylesheet" type="text/css" href="view/css/Employee-CSS.css">
	</head>
	<body>
		<!-- Header Semantics -->
		<header>
			<div id="logo"> <h2> MetaCube Softwares Pvt. Ltd. </h2> </div>
			<!-- Nav Semantics -->
			<nav>
				<!-- List -->
				<ul>
					<li> <% out.write("<a href=\"/mvc/EmployeeDataFetchAndSend\"> List of Employees </a>"); %> </li>
					<li> <% out.write("<a href=\"/mvc/RegistrationPage?id="+(-1)+"\" style=\"margin: 0 10px 0 10px\"> Register Here </a>"); %> </li>
				</ul>
			</nav>
		</header>
		<!-- Content Div -->
		<div id="content">
			<%
			// Consisting the Information
			Employee e = (Employee)request.getAttribute("employeeDetails");
			// Getting the Employee Id
			out.println("Employee ID: " + e.getEmployeeID());
			out.write("<br>");
			// getting the Name
			out.println("Emloyee Name: " + e.getName());
			out.write("<br>");
			// Getting the Age
			out.println("Age: " + e.getAge());
			out.write("<br>");
			// Getting the Date Of Registration
			out.println("Date of Registration: " + e.getDateOfRegistration());
			out.write("<br>");
			// Getting the Last Updated
			out.println("Last Updated: " + e.getLastUpdated());
			// Calling the Page
			out.write("<a href=\"/mvc/RegistrationPage?id="+(e.getEmployeeID()-1)+"\" style=\"margin: 0 10px 0 10px\"> Edit details </a>");
			%>
		</div>
	</body>
</html>