<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<%@ include file="header.jsp"%>
	<p><a href="./principale">Retour</a></p><br/>
	<form method="post" action="">
		<label for="nom">Nom :   </label> 
		<input type="text" name="nom" id="nom" required/><br /><br/>
		<label for="prenom">Prenom : </label> 
		<input type="text" name="prenom" id="prenom" required/><br/><br/> 
		<label for="adresse">Adresse : </label> 
		<textarea name="adresse" id="adresse" rows="3" cols="50" required></textarea><br /><br/>
		<label for="email">Email :  </label> 
		<input type="email" name="email" id="email" required pattern="^[\w \- \.]+@[(\w \.)]+[\w]{2,4}$"/><br/> <br/>
		<label for="tel">Tel:   </label>
		<input type="tel" name="tel" id="tel" required pattern="^(\+33|0|0033)[1-9][0-9]{8}$"/><br/><br/>
		<label for="formation">Choisir une formation</label> 
		<select name="idFormation" id="idFormation">
			<c:forEach items="${ listFormation }" var="formation">
				<option value='<c:out value="${ formation.getId() }"/>'>
					<c:out value="${ formation.getNom() }"/></option>
			</c:forEach>
		</select><br/><br/>
		<input type="submit" value="ajouter" />
	</form>
</body>
</html>