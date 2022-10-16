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
	<p><a href='./liststagiaire?idFormation=<c:out value="${ idFormation }"/>'>Retour</a></p><br/><br/>
	<h3> <c:out value="${ stagiaire.getNom() } ${ stagiaire.getPrenom() }"/> </h3><br/>
	<p>
		Adresse: <c:out value="${ stagiaire.getAdresse() }"/><br/>
		Tel: <c:out value="${ stagiaire.getTel() }"/><br/>
		Email: <c:out value="${ stagiaire.getEmail() }"/><br/>
	</p>
</body>
</html>