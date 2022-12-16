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
	<h1> <c:out value="${book.title}"/> </h1>
	<a href="/" >Back to the shelves</a>
</div>
	<div>
	<p>
		<c:if test="${loggedInUser == book.user}">
			 you 
		</c:if>
		<c:if test="${loggedInUser != book.user}">
			<c:out value="${book.user.userName }"> </c:out> 
		</c:if>
	read
	<c:out value="${book.title }"/> 
	by
	<c:out value="${book.author }"/>
	
	</p>
	<p>Here are <c:if test="${loggedInUser == book.user}">
			 your
		</c:if>
		<c:if test="${loggedInUser != book.user}">
			<c:out value="${book.user.userName }'s"> </c:out> 
		</c:if>
		thoughts
		</p>
	</div>
	<div>
	<c:out value="${book.thoughts }"/>
	</div>
	<div>
	<c:if test="${loggedInUser == book.user}">
			 <a href="/books/edit/${book.id}">Edit</a>
			 <form action="/books/${book.id}" method="post">
		    			<input type="hidden" name="_method" value="delete">
		    			<input type="submit" value="Delete">
			 </form>
	</c:if>
	</div>
</body>
</html>