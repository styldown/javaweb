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
			
			<c:out value="${ erreur }" />
			<form method="post" action="./connection">
            <label for="login">Login : </label>
            <input type="text" name="login" id="login" required/><br/>
            <label for="login">Mot de pass : </label>
            <input type="password" name="pwd" id="pwd" required/><br/>
            <input type="submit" value="connecter" />
            </form>
           
</body>
</html>