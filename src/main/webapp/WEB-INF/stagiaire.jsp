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
	<p><a href='./liststagiaire?idFormation=<c:out value="${ idFormation }"/>'><img src="images/precedent.jpg" alt="retour" height="50"  width="60"></a></p>
	<h3> <c:out value="${ stagiaire.getPrenom()} ${ stagiaire.getNom() }"/> </h3>
	<p>
		Adresse: <c:out value="${ stagiaire.getAdresse() }"/><br/>
		Tel: <c:out value="${ stagiaire.getTel() }"/><br/>
		Email: <c:out value="${ stagiaire.getEmail() }"/><br/>
	</p>
</body>
</html>