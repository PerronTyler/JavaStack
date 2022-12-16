<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Namaste,  <c:out value= "${loggedInUser.userName}"/> </h1>
	<a href="users/logout" >Logout</a>
	<h2> Course Schedule</h2>
	<div>
	
		<table>
	<thead>
		<tr>
			<th> ID </th>
			<th> Course Name </th>
			<th> Instructor </th>
			<th> Weekday </th>
			<th> Price </th>
		</tr>
	</thead>
	<tbody>
		
		<c:forEach var="course" items="${courses}">
			<tr>
				<td><c:out value = "${course.id}"/> </td>
				<td> <a href="courses/${course.id }"><c:out value = "${course.courseName}"/></a> <c:if test="${loggedInUser == course.instructor}">
			 <a href="/courses/edit/${course.id}">Edit</a>
	</c:if> </td>
				<td><c:out value = "${course.teacher}"/> </td>
				<td><c:out value = "${course.weekday}"/> </td>
				<td><c:out value = "${course.price}"/> </td>
			</tr>
		</c:forEach>
		
	</tbody>
</table>
	</div>
	<a href="courses/new">Add course to the Yoga Studio</a>
</body>
</html>