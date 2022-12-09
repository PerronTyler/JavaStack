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
		<h3>Edit Expense</h3>
		
    <form:form action="/expenses/edit/process/${expense.id}" method="post" modelAttribute="expense">
    <input type="hidden" name="_method" value="put">
    	<div>
	<form:label path="name">Name of Expense:</form:label>
    <form:input path="name"/>
    <form:errors path="name"/>
    	</div>
    	<div>
    <form:label path="vendor">Name of Vendor:</form:label>
    <form:input path="vendor"/>
	<form:errors path="vendor"/>
    	</div>
    	<div>
    <form:label path="price">Cost of Expense:</form:label>
    <form:input path="price"/>
	<form:errors path="price"/>
    </div>
    <div>
    <form:label path="description">Description:</form:label>
    <form:input path="description"/>
	<form:errors path="description"/>
    </div>
    	<input type="submit" value="submit">
    </form:form>
	</div>
</body>
</html>