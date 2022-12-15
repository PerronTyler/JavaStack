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
	<h1> <c:out value="${dojo.name}"/> </h1>
	<div>
		<table>
	<thead>
		<tr>
			<th> First Name </th>
			<th> Last Name </th>
			<th> Age </th>
		</tr>
	</thead>
	<tbody>
		
		<c:forEach var="ninja" items="${dojo.ninjas}">
			<tr>
				<td><c:out value = "${ninja.firstName}"/> </td>
				<td><c:out value = "${ninja.lastName}"/> </td>
				<td><c:out value = "${ninja.age}"/> </td>
			</tr>
		</c:forEach>
		
	</tbody>
</table>
	</div>
</body>
</html>