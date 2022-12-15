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
	<h1> Create a new Dojo</h1>
	<div>
		<h3>New Dojo</h3>
		
    <form:form action="/dojos/process" method="post" modelAttribute="dojo">
    	<div>
	<form:label path="name">name:</form:label>
    <form:input path="name"/>
    <form:errors path="name"/>
    	</div>
    	<input type="submit" value="submit">
    </form:form>
	</div>
</body>
</html>