package com.octest.dao;

import com.octest.beans.Authentification;
import com.octest.beans.Factory;
import com.octest.beans.Formation;
import com.octest.beans.Stagiaire;
import com.octest.beans.Utilisateur;

public abstract class FactoryOfImpl {
	// recuperation des DAO
		public static DAO<Authentification> getAuthentificationDAO(){
	        return new AuthentificationDAOImpl();
		}
		
		public static DAO<Utilisateur> getUtilisateurDAO(){
			return new UtilisateurDAOImpl();
		}
		
		public static DAO<Factory> getFactoryDAO(){
			return new FactoryDAOImpl();
		}


		public static DAO<Stagiaire> getStagiareDAO() {
			return new StagiaireDAOImpl();
		}
		
		public static DAO<Formation> getFormationDAO() {
			return new FormationDAOImpl();
		}
}
