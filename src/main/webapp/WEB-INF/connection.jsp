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
			<center>
			<c:out value="${ erreur }" />
			<form method="post" action="">
            <label for="login">Login : </label>
            <input type="text" name="login" id="login" /><br/>
            <label for="login">Mot de pass : </label>
            <input type="password" name="pwd" id="pwd" /><br/>
            <input type="submit" value="connecter"/></center>
            </form>
            </center>
</body>
</html>