<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<header>
		<%@ include file="header.jsp" %>
	</header>
	<p><a href="./listformation">
		Liste des formations <mark><c:out value="${ factory.getNom() }"/></mark></a></p>
	<p><a href="./ajoutstagiaire">Ajouter un nouveau stagiaire</a></p>
	<p><a href="./ajoutformation">Ajouter une nouvelle formation</a></p>
</body>
</html>