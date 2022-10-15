package com.octest.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.octest.beans.Factory;
import com.octest.beans.Stagiaire;

public class StagiareDAOimpl extends DAO<Stagiaire> {

	private Object ArrayList;
	private java.util.ArrayList<Stagiaire> Stagiaire;

	@Override
	public Stagiaire find(int id) {
		// TODO Auto-generated method stub
		return null;
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
		Factory factory=null;
		 try {
	    	 
	    	 connect = DAOFactory.getInstance();
	    	 preparedStatement = connect.prepareStatement
	            		("SELECT * FROM stagiaire WHERE formation_id=?;");
	    	 preparedStatement.setInt(1, id);
	         ResultSet resultat= preparedStatement.executeQuery();
	        
	         while (resultat.next()) {
	        	 int idFac= resultat.getInt("id") ;
	        	 String nom= resultat.getString("nom");
	        	 String adresse= resultat.getString("adresse");
	        	 factory= new Factory(idFac, nom, adresse);
	         }
	          
	     } catch (SQLException e) {
	         e.printStackTrace();
	        }
	     return factory;
	}

}
