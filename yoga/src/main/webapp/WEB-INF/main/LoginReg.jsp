<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
		<h3>Register</h3>
		
    <form:form action="/users/login/register" method="post" modelAttribute="newUser">
    	<div>
	<form:label path="userName">userName:</form:label>
    <form:input path="userName"/>
    <form:errors path="userName"/>
    	</div>
    	<div>
    <form:label path="email">Email:</form:label>
    <form:input path="email"/>
	<form:errors path="email"/>
    	</div>
    	<div>
    <form:label path="password">Password:</form:label>
    <form:input path="password"/>
	<form:errors path="password"/>
    </div>
    <div>
    <form:label path="confirm">Confirm Password:</form:label>
    <form:input path="confirm"/>
	<form:errors path="confirm"/>
    </div>
    	<input type="submit" value="submit">
    </form:form>
	</div>
	<div>
		<h3>Login</h3>
		
    <form:form action="/users/login" method="post" modelAttribute="loginUser">
    	<div>
	<form:label path="email">Email:</form:label>
    <form:input path="email"/>
    <form:errors path="email"/>
    	</div>
    	<div>
    <form:label path="password">Password:</form:label>
    <form:input path="password"/>
	<form:errors path="password"/>
    	</div>
    	<input type="submit" value="submit">
    </form:form>
	</div>
</body>
</html>