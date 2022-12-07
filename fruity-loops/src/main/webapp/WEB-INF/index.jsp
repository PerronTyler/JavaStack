
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	  <h1>Fruit in Store</h1>
    <c:forEach var="fruit" items="${fruits}">
        <p><c:out value="${fruit.name}"></c:out></p>
        <p><c:out value="${fruit.price}"></c:out></p>
    </c:forEach>
</body>
</html>