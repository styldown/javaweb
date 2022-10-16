package com.octest.forms;

import com.octest.beans.Authentification;

import com.octest.beans.Utilisateur;
import com.octest.dao.DAO;
import com.octest.dao.FactoryOfImpl;

public class Formulaire {
	
	public Utilisateur authentification(String login, String pwd) {
		Authentification auth= new Authentification(login, pwd);
		Utilisateur utilisateur= null;
		DAO<Authentification> authDao= FactoryOfImpl.getAuthentificationDAO();
		authDao.lookFor(auth);
		if(auth.getId() != 0) {
			DAO<Utilisateur> util= FactoryOfImpl.getUtilisateur();
			utilisateur=util.find(auth.getIdUtilisateur());
		}
		
		return utilisateur;
		
	}

}
