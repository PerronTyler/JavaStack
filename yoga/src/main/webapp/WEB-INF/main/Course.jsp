<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	<h1><a href="/" >Back to the studio</a>  </h1>
	
</div>
	<div>
	<p>
	<c:out value="${course.courseName}"/> with
		<c:if test="${loggedInUser == course.instructor}">
			 you 
		</c:if>
		<c:if test="${loggedInUser != course.instructor}">
			<c:out value="${course.teacher }"> </c:out> 
		</c:if>
	</p>
	</div>
	<div>
	<p>
	day: 
	<c:out value="${course.weekday }"/> 
	</p>
	</div>
	<div>
	<p>
	Cost: $<c:out value="${course.price }"/>.00
	</p>
	</div>
	<div>
	<p>
	<c:out value="${course.description }"/>
	</p>
	</div>
	<div>
	<c:if test="${loggedInUser == course.instructor}">
			 <a href="/courses/edit/${course.id}">Edit</a>
			 <form action="/courses/${course.id}" method="post">
		    			<input type="hidden" name="_method" value="delete">
		    			<input type="submit" value="Delete">
			 </form>
	</c:if>
	</div>
</body>
</html>