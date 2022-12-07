<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h3>Omikuji Form</h3>
    <form action='/omikuji/process' method='post'>
	<label>Pick any number from 5 to 25:</label>
    	<input type="number" name='number'>
    <label>Enter the name of ANY City:</label>
    	<input type="text" name='city'>
    	<label>Enter the name of a person:</label>
    	<input type="text" name='person'>
	<label>Enter Hobby:</label>
    	<input type='text' name='hobby'>
    <label>Enter a type of living thing:</label>
    	<input type="text" name='thing'>
    <label>Say something nice to someone:</label>
    	<input type="text" name='nice'>
    	<input type='submit' value='submit'>
    </form>
</body>
</html>