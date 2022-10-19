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
			
		<div id="connexionform">
		<div class="formulaire">
		<p style="color: red;"><c:out  value="${ erreur }" /></p>
			<form method="post" action="./connection" id="form">
            <label for="login">Login : </label><br/>
            <input class="input_formulaire" type="text" name="login" id="login" required/><br/>
            <label for="login">Mot de passe : </label><br/>
            <input class="input_formulaire" type="password" name="pwd" id="pwd" required/><br/>
            <input class="input_formulaire" type="submit" value="connecter" />
            </form>
      	</div>
      	</div>
           
</body>
</html>