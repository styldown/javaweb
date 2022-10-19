<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div id="conteneur">
    <div class="element 1"><c:if test = "${session}">
         <p><a href="./connection"><img src="images/deconnexion.jpg" alt="Deconnecter" height="70"  width="80"></a><p>
      </c:if> </div>
    <div class="element 2"><h2><c:out value="${ factory.getNom() }">Veuillez vous connecter</c:out></h2> 
    <h5><c:out value="${ utilisateur.getNom() } ${ utilisateur.getPrenom() }">******************</c:out></h5></div>
	<div class="element 3"></div>
</div>


      
    
        
 

