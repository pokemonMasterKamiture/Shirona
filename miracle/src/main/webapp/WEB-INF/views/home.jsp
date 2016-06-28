<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
	<title>Home</title>

</head>
<body>
<h1>
	Hello world!
</h1>
<form:form modelAttribute="data">
<form:input path="name" required="required"/>
<button type="submit">${name}</button>
</form:form>

<c:forEach var="obj" items="${fuck}" varStatus="status">
<c:out value="${obj.name}"/><br>
</c:forEach>
</body>
</html>
