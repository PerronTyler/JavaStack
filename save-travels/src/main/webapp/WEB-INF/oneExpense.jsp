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
	<h1> Expense : <c:out value="${oneExpense.name }"/> </h1>
	<h4> Vendor : <c:out value="${oneExpense.vendor }"/></h4>
	<h4> Price : <c:out value="${oneExpense.price }"/></h4>
	<h4> Description : <c:out value="${oneExpense.description }"/></h4>
</body>
</html>