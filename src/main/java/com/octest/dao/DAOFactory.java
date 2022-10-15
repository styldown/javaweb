package com.octest.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.octest.beans.Authentification;
import com.octest.beans.Factory;
import com.octest.beans.Utilisateur;

public class DAOFactory {

	private static String url = "jdbc:mysql://54.159.209.82:3306/simplon";
	    /**
	     * Nom du userery'(y-
	     */
	private static String user = "root";
	    /**
	     * Mot de passe du user
	     */
	private static String passwd = "********";
	    /**
	     * Objet Connexion
	     */
	private static Connection connect;
	    
	    /**
	     * Méthode qui va nous retourner notre instance
	     * et la créer si elle n'existe pas...
	     * @return
	     */
	public static Connection getInstance(){
		try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        	System.out.println("erreu1");

        }

		try {
			connect= DriverManager.getConnection(url, user, passwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        	System.out.println("erreu2");

		}
        return connect;
    }    
	       
		
		// empecher l'accé au constructeur
	private DAOFactory() {
   	  }
	
		// recuperation des DAO
	public static DAO<Authentification> getAuthentificationDAO(){
        return new AuthentificationDAOImpl();
	}
	
	public static DAO<Utilisateur> getUtilisateur(){
		return new UtilisateurDAOImpl();
	}
	
	public static DAO<Factory> getFactory(){
		return new FactoryDAOImpl();
	}

}
