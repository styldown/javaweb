package com.octest.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.octest.beans.Factory;

public class FactoryDAOImpl extends DAO<Factory> {

	@Override
	public Factory find(int id) {
		PreparedStatement preparedStatement = null;
		Factory factory=null;
		ResultSet resultat=null;
		 try {
	    	 
	    	 connect = DAOFactory.getInstance();
	    	 preparedStatement = connect.prepareStatement
	            		("SELECT * FROM factory WHERE id=?;");
	    	 preparedStatement.setInt(1, id);
	         resultat= preparedStatement.executeQuery();
	        
	         if (resultat.next()) {
	        	 int idFac= resultat.getInt("id") ;
	        	 String nom= resultat.getString("nom");
	        	 String adresse= resultat.getString("adresse");
	        	 factory= new Factory(idFac, nom, adresse);
	         }
	          
	     } catch (SQLException e) {
	         e.printStackTrace();
	        }
		 finally{
			 try {
				 if (resultat != null)
					 resultat.close();
	             if (preparedStatement != null)
	            	 preparedStatement.close();
	             if (connect != null)
	            	 connect.close();
				
			} catch (SQLException ignore) {
			}
		 }
	     return factory;
	}

	@Override
	public Factory create(Factory obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factory update(Factory obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Factory obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void lookFor(Factory obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Factory> listeOf(int id, int selecteur) {
		// TODO Auto-generated method stub
		return null;
	}

}
