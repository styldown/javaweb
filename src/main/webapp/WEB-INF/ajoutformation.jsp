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
	<%@ include file="header.jsp"%>
	</header>
	<script src="script/controleformulaire.js"></script>
	<p><a href="./principale"><img src="images/precedent.jpg" alt="retour" height="50"  width="60"></a></p><br/>
	<form method="post" name="formulaire" onsubmit="return confirmAjoutFormation()" action="./ajoutformation">
		<label for="nom">Nom de la formation:   </label> <br/>
		<input type="text" name="nom" id="nom" required/><br /><br/>
		<input type="submit" value="confirmer"  />
	</form>
	
</body>
</html>