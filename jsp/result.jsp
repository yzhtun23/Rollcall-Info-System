<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Roll Call Info System</title>
<link rel="stylesheet" href="./css/bootstrap.css" />
</head>
<body>
	<div align="center" style="margin-top:50px;">
		<h1>Roll Call Info System</h1>

		<div align="center">
		<h3>5th Year Software Engineering, ${rollcall.rollno}, ${output}, ${se_eng}</h3>
		<h3 style=color:green;>
			<c:choose>
				<c:when test="${se_eng>=75 }">
					KYAW DAL
				</c:when>
			</c:choose>
		</h3>
		
		<h3 style=color:red;>
			<c:choose>
				<c:when test="${se_eng<75 }">
					KYAW DAL
				</c:when>
			</c:choose>
		</h3>
		
		<div class="col-lg-8 col-lg-offset-2">
		
		<form:form action="" modelAttribute="rollcall">
			<table border="1" class="table table-striped table-hover">
				<tr>
					<th>Roll No.</th>
					<th>Name</th>
					<th>Eng</th>
					<th>501</th>
					<th>502</th>
					<th>503</th>
					<th>504</th>
					<th>505</th>
					<th>506</th>
				</tr>
				<c:forEach var="rollcall" items="${rollcallList}"
					varStatus="status">
					<tr>
						<td>${rollcall.rollno}</td>
						<td>${rollcall.name}</td>
						<td>${rollcall.se_eng}</td>
						<td>${rollcall.se_501}</td>
						<td>${rollcall.se_502}</td>
						<td>${rollcall.se_503}</td>
						<td>${rollcall.se_504}</td>
						<td>${rollcall.se_505}</td>
						<td>${rollcall.se_506}</td>
					</tr>
				</c:forEach>
			</table>
			</form:form>
		</div>
	</div>
	</div>
</body>
</html>
