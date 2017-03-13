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
	<div align="center" style="margin-top:200px;">
		<h1>Roll Call Info System</h1>

		<form:form action="searchRC.do" method="post" commandName="rollcall">
			<div class="form-group col-lg-4 col-lg-offset-4">
				<form:label path="rollno">Enter Roll No. or Name</form:label> 
				<form:input type="text" class="form-control" path="rollno" />
				<br>
				<input type="submit" class="btn btn-primary" id="search_btn" value="search">
			</div>
		</form:form>
		
	</div>
</body>
</html>
