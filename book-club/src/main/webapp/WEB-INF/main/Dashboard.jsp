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
	<h1>Dashboard <c:out value= "${loggedInUser.userName}"/> </h1>
	<a href="users/logout" >Logout</a>
	<a href="books/new">Add a book to your bookshelf</a>
	<div>
		<table>
	<thead>
		<tr>
			<th> ID </th>
			<th> Title </th>
			<th> Author </th>
			<th> Posted by </th>
		</tr>
	</thead>
	<tbody>
		
		<c:forEach var="book" items="${books}">
			<tr>
				<td><c:out value = "${book.id}"/> </td>
				<td> <a href="books/${book.id }"><c:out value = "${book.title}"/></a> </td>
				<td><c:out value = "${book.author}"/> </td>
				<td><c:out value = "${book.user.userName}"/>  </td>
			</tr>
		</c:forEach>
		
	</tbody>
</table>
	</div>
</body>
</html>