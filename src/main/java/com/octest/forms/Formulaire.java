package com.octest.forms;

import com.octest.beans.Authentification;
import com.octest.beans.Formation;
import com.octest.beans.Stagiaire;
import com.octest.beans.Utilisateur;
import com.octest.dao.DAO;
import com.octest.dao.FactoryOfImpl;

public  class Formulaire {
	public static Formulaire instance;
	
	private Formulaire() {
	}
	
	public static Formulaire getInstance() {
		if (instance==null) {
			instance= new Formulaire();
		}
		return instance;
	}
	
	public   Utilisateur authentification(String login, String pwd) {
		Authentification auth= new Authentification(login, pwd);
		Utilisateur utilisateur= null;
		DAO<Authentification> authDao= FactoryOfImpl.getAuthentificationDAO();
		authDao.lookFor(auth);
		if(auth.getId() != 0) {
			DAO<Utilisateur> util= FactoryOfImpl.getUtilisateurDAO();
			utilisateur=util.find(auth.getIdUtilisateur());
		}
		
		return utilisateur;
		
	}

	public void ajouterStagiaire(String nom, String prenom, String adresse, String email,
			String tel, int idFormation,int idFactory) {
		Stagiaire stagiaire= new Stagiaire(nom, prenom, adresse, tel, email, idFactory, idFormation);
		DAO<Stagiaire> stagDao= FactoryOfImpl.getStagiareDAO();
		stagDao.create(stagiaire);
	}

	public void ajouterFormation(String nom, int idFactory) {
		Formation formation= new Formation(nom, idFactory);
		DAO<Formation> forDao= FactoryOfImpl.getFormationDAO();
		forDao.create(formation);
		
	}

}
