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
	<p><a href='./listformation'>retour</a></p>
	<ul>
	<c:forEach items="${ listeStagiare}" var="stagiaire">
    <li><a href='./stagiaire?idStagiaire=<c:out value="${ stagiaire.getId() }"/>'>  
    	<c:out value="${ stagiaire.getNom() } ${ stagiaire.getPrenom() }" ></c:out></a></li>
</c:forEach>
</ul>
</body>
</html>