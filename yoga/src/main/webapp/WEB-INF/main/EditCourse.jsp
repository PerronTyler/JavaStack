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
		<h3>Edit Book</h3>
		
    <form:form action="/courses/edit/process/${course.id}" method="post" modelAttribute="course">
    <input type="hidden" name="_method" value="put">
    	<div>
	<form:label path="courseName">Course Name:</form:label>
    <form:input path="courseName"/>
    <form:errors path="courseName"/>
    	</div>
    	<div>
    <form:input type="hidden" path="instructor" value="${loggedInUser.id}"/>
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
    <c:if test="${loggedInUser == course.instructor}">
			 <form action="/courses/${course.id}" method="post">
		    			<input type="hidden" name="_method" value="delete">
		    			<input type="submit" value="Delete">
			 </form>
	</c:if>
	<div>
	<h1><a href="/" >cancel</a>  </h1>
	
</div>
	</div>
</body>
</html>