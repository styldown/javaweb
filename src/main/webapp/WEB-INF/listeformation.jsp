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
	<p><a href="./principale"><img src="images/precedent.jpg" alt="retour" height="50"  width="60"></a></p>
	<ul><c:forEach items="${ listFormation }" var="formation" varStatus="status">
    <li><a href='./liststagiaire?idFormation=<c:out value="${ formation.getId() }"/>'>  
    	<c:out value="${ formation.getNom()}" ></c:out></a></li>
</c:forEach></ul>
</body>
</html>