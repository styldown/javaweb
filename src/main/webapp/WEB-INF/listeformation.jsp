<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<c:forEach items="${ listFormation }" var="formation" varStatus="status">
    <p><a href='/liststagiaire?idFormation=<c:out value="${ formation.getId() }"/>'>  
    	N°<c:out value="${ formation.getNom() }" ></c:out></a></p>
</c:forEach>
</body>
</html>