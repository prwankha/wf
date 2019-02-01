<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginPage</title>
</head>
<body>
	<h2>Welcome :${compNameObj}</h2>
	<hr color="green" size="3"/>
		<h3>LOGIN</h3>
		<form:form action="ValidateUser.obj" modelAttribute="log" method="Post">
			UserName :<form:input path="userName"/><form:errors path="userName"/><br/>
			Password :<form:password path="password"/><form:errors path="password"/><br/><br/>
				<input type="submit" name="Login" value="login">
				<input type="reset" value="Reset" name="Reset">
		</form:form>
</body>
</html>