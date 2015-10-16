<%@page import="com.sun.org.apache.bcel.internal.generic.INSTANCEOF"%>
<%@page import="com.modal.Employee"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Html Tag -->
<html>
	<!-- Head semantics -->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> Edit Employee Details </title>
		<link rel="stylesheet" type="text/css" href="view/css/Employee-CSS.css">
	</head>
	<body>
		<!-- Header tag -->
		<header>
			<!-- Logo Div -->
			<div id="logo"> <h2> MetaCube Softwares Pvt. Ltd. </h2> </div>
			<!-- Nav Semantics -->
			<nav>
				<ul>
					<li> <% out.write("<a href=\"/mvc/EmployeeDataFetchAndSend\"> List of Employees </a>"); %> </li>
					<li> <% out.write("<a href=\"/mvc/RegistrationPage?id="+(-1)+"\" style=\"margin: 0 10px 0 10px\"> Register Here </a>"); %> </li>
				</ul>
			</nav>
		</header>
		<!-- Content Div -->
		<div id="content">
			<%
				Object e = request.getAttribute("employeeDetails");
				int employeeId = 0;
				String name = "";
				int age = 0;
				java.util.Date date = new Date();
				// Getting the INstance Of employee
				if (e instanceof Employee)
				{
					Employee e1 = (Employee) e;
					employeeId = e1.getEmployeeID();
					name = e1.getName();
					age = e1.getAge();
					date = e1.getDateOfRegistration();
				}
				// If not the List Creates the data
				else
				{
					employeeId = (Integer)request.getAttribute("newUser");
				}
			%>
			<!-- Form Created -->
			<form>
				<label> Employee Id:</label>
				<input type=text value="<%=employeeId%>"  name="id"readonly="readonly" required/>
				<br>
				<!-- Name Label -->
				<label> Name:</label>
				<input type=text value="<%=name%>" name="employeeName"  required/>
				</br>
				<!-- Age LAbel -->
				<label> Age:</label>
				<input type=text value="<%=age%>" name="age" required/>
				</br>
				<!-- Date Of Birth Registration -->
				<label> Date oF Registration:</label>
				<input type=text value="<%=date%>" disabled="disabled" name="doR" Required/>
				<br>
				<!-- Submit Button -->
				<input type=submit  formaction="/mvc/RegistrationUpdate?id="+(e.getEmployeeID()-1) value="Store Data">
			</form>
		</div>
	</body>
</html>