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
	<h1> Create a new Course</h1>
	<div>
		<h3>New Course</h3>
		
    <form:form action="/courses/process" method="post" modelAttribute="course">
    	<div>
	<form:label path="courseName">Course Name:</form:label>
    <form:input path="courseName"/>
    <form:errors path="courseName"/>
    	</div>
    	<div>
    <form:input type="hidden" path="instructor" value="${loggedInUser.id }"/>
    </div>
    	<div>
    <form:label path="weekday">Weekday:</form:label>
    <form:input path="weekday"/>
	<form:errors path="weekday"/>
    	</div>
    	<div>
    <form:label path="description">Description:</form:label>
    <form:input path="description"/>
	<form:errors path="description"/>
    </div>
    <div>
    <form:input type="hidden" path="teacher" value="${loggedInUser.userName }"/>
    </div>
    <div>
    <form:label path="price">Price:</form:label>
    <form:input path="price" type="number"/>
	<form:errors path="price"/>
    </div>
    
    	<input type="submit" value="submit">
    </form:form>
	</div>
	<div>
	<h1><a href="/" >cancel</a>  </h1>
	
</div>
</body>
</html>