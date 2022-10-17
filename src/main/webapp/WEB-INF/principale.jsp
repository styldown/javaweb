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
	<p><a href="./listformation">
		Liste des formations <mark><c:out value="${ factory.getNom() }"/></mark></a></p>
	<p><a href="./ajoutstagiaire">Ajouter un nouveau stagiaire</a></p>
</body>
</html>