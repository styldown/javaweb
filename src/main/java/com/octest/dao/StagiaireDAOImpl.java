package com.octest.dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.octest.beans.Stagiaire;

public class StagiaireDAOImpl extends DAO<Stagiaire> {

	@Override
	public Stagiaire find(int id) {
		PreparedStatement preparedStatement = null;
		Stagiaire stagiaire=null;
		 try {
	    	 
	    	 connect = DAOFactory.getInstance();
	    	 preparedStatement = connect.prepareStatement
	            		("SELECT * FROM stagiaire WHERE id=?;");
	    	 preparedStatement.setInt(1, id);
	         ResultSet resultat= preparedStatement.executeQuery();
	         
	         if (resultat.next()) {
	        	 int idStag= resultat.getInt("factory_id") ;
	        	 String nom= resultat.getString("nom");
	        	 String prenom= resultat.getString("prenom");
	        	 String adresse= resultat.getString("adresse");
	        	 int tel=  resultat.getInt("tel");
	        	 String email= resultat.getString("email");
	        	 int idFactory=  resultat.getInt("factory_id");
	        	 int idFormation=  resultat.getInt("formation_id");
	        	 stagiaire= new Stagiaire(idStag,  nom,  prenom, adresse,  tel,  email,  idFactory,  idFormation);
	        			 
	         }
	          
	     } catch (SQLException e) {
	         e.printStackTrace();
	        }
	     return stagiaire;
	}

	@Override
	public Stagiaire create(Stagiaire obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stagiaire update(Stagiaire obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Stagiaire obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lookFor(Stagiaire obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Stagiaire> listeOf(int id, int selecteur) {
		ArrayList<Stagiaire> listStagiaire= new ArrayList<Stagiaire>();
		PreparedStatement preparedStatement = null;
		
		 try {
	    	 
	    	 connect = DAOFactory.getInstance();
	    	 preparedStatement = connect.prepareStatement
	            		("SELECT * FROM stagiaire WHERE formation_id=?;");
	    	 preparedStatement.setInt(1, id);
	         ResultSet resultat= preparedStatement.executeQuery();
	        
	         while (resultat.next()) {
	        	 int idStag= resultat.getInt("id") ;
	        	 String nom= resultat.getString("nom");
	        	 String prenom= resultat.getString("prenom");
	        	 String adresse= resultat.getString("adresse");
	        	 int tel= resultat.getInt("tel");
	        	 String email= resultat.getString("email");
	        	 int idFormation= resultat.getInt("formation_id");
	        	 int idFactory= resultat.getInt("factory_id");
	        	 Stagiaire stagiaire= new Stagiaire(idStag, nom, prenom, adresse, tel, email, idFactory, idFormation);
	        	 listStagiaire.add(stagiaire);
	         }
	          
	     } catch (SQLException e) {
	         e.printStackTrace();
	        }
	     return listStagiaire;
	}

}
