<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<hr>
<center><h2><c:out value="${ utilisateur.getNom() }">Veuillez vous connecter</c:out></h2></center>
<center><h5><c:out value="${ factory.getNom() }">******************</c:out></h5></center>
      <c:if test = "${session}">
         <p><a href="./connection">Deconnection</a><p>
      </c:if>

<hr>