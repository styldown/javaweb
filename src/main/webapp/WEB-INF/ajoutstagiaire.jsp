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
	<p><a href="./principale"><img src="images/precedent.jpg" alt="retour" height="50"  width="60"></a></p><br/>
	<script src="script/controleformulaire.js"></script>
	<form name="formulaire" onsubmit="return confirmAjoutStagiaire()" method="post" action="./ajoutstagiaire">
		<label for="nom">Nom :   </label> <br/>
		<input type="text" name="nom" id="nom" required/><br /><br/>
		<label for="prenom">Prenom : </label> <br/>
		<input type="text" name="prenom" id="prenom" required/><br/><br/> 
		<label for="adresse">Adresse : </label> <br/>
		<textarea name="adresse" id="adresse" rows="3" cols="50" required></textarea><br /><br/>
		<label for="email">Email :  </label> <br/>
		<input type="email" name="email" id="email" required pattern="^[\w-\.]+@[\w]+([\w-]+[\w]){0,}\.[\w]{2,}$"/><br/> <br/>
		<label for="tel">Tel:   </label><br/>
		<input type="tel" name="tel" id="tel" required pattern="^(\+33|0|0033)[1-9][0-9]{8}$"/><br/><br/>
		<label for="idFormation">Choisir une formation</label> 
		<select name="idFormation" id="idFormation">
			<c:forEach items="${ listFormation }" var="formation">
				<option value='<c:out value="${ formation.getId() }"/>'>
					<c:out value="${ formation.getNom() }"/></option>
			</c:forEach>
		</select><br/><br/>
		<input type="submit" value="confirmer" />
	</form>
</body>
</html>