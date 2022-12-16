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
	<h1> Create a new Book</h1>
	<div>
		<h3>New Book</h3>
		
    <form:form action="/books/process" method="post" modelAttribute="book">
    	<div>
	<form:label path="title">Title:</form:label>
    <form:input path="title"/>
    <form:errors path="title"/>
    	</div>
    	<div>
    <form:label path="author">Author:</form:label>
    <form:input path="author"/>
	<form:errors path="author"/>
    	</div>
    	<div>
    <form:label path="thoughts">My Thoughts:</form:label>
    <form:input path="thoughts"/>
	<form:errors path="thoughts"/>
    </div>
    <div>
    <form:input type="hidden" path="user" value="${user_id }"/>
    </div>
    	<input type="submit" value="submit">
    </form:form>
	</div>
</body>
</html>