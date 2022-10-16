package com.octest.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.octest.beans.Formation;

public class FormationDAOImpl extends DAO<Formation>{

	@Override
	public Formation find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Formation create(Formation obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Formation update(Formation obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Formation obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lookFor(Formation obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Formation> listeOf(int id, int selecteur) {
		ArrayList<Formation> listFormation= new ArrayList<Formation>();
		PreparedStatement preparedStatement = null;
		
		 try {
	    	 
	    	 connect = DAOFactory.getInstance();
	    	 preparedStatement = connect.prepareStatement
	            		("SELECT * FROM formation WHERE factory_id=?;");
	    	 preparedStatement.setInt(1, id);
	         ResultSet resultat= preparedStatement.executeQuery();
	        
	         while (resultat.next()) {
	        	 int idFor= resultat.getInt("id") ;
	        	 String nom= resultat.getString("nom");
	        	 int idFactory= resultat.getInt("factory_id");
	        	 Formation Formation= new Formation(idFor, nom,idFactory);
	        	 listFormation.add(Formation);
	         }
	          
	     } catch (SQLException e) {
	         e.printStackTrace();
	        }
	     return listFormation;
	}

}
