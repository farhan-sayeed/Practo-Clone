<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>successfully registered</title>
</head>
<body>
<h1 style="color: green">${msg }</h1>
<hr>
<h1>Welcome ${user.username} </h1>
<h1>Your email address is ${user.email }</h1>
<h1>Your password is ${user.password }</h1>
</body>
</html>