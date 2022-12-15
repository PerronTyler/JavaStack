<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Create a new Ninja</h1>
	<div>
		<h3>New Ninja</h3>
		
    <form:form action="/ninjas/process" method="post" modelAttribute="ninja">
    	<div>
	<form:label path="firstName">First Name:</form:label>
    <form:input path="firstName"/>
    <form:errors path="firstName"/>
    	</div>
    	<div>
    <form:label path="lastName">Last Name:</form:label>
    <form:input path="lastName"/>
	<form:errors path="lastName"/>
    	</div>
    	<div>
    <form:label path="age">Age:</form:label>
    <form:input path="age" type="number"/>
	<form:errors path="age"/>
    </div>
    <div>
    <form:label path="dojo">Description:</form:label>
    <form:select path="dojo">
    <form:option value="NONE"> --SELECT DOJO-- </form:option>
    <form:options items="${dojos}"></form:options>
    </form:select>
	<form:errors path="dojo"/>
    </div>
    	<input type="submit" value="submit">
    </form:form>
	</div>
</body>
</html>