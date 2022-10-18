package com.octest.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.octest.beans.Utilisateur;

public class UtilisateurDAOImpl extends DAO<Utilisateur> {

	@Override
	public Utilisateur find(int id) {
		 PreparedStatement preparedStatement = null;
		 Utilisateur utilisateur=null;
		 ResultSet resultat=null;
		 try {
	    	 
	    	 connect = DAOFactory.getInstance();
	    	 preparedStatement = connect.prepareStatement
	            		("SELECT * FROM utilisateur WHERE id=?;");
	    	 preparedStatement.setInt(1, id);
	         resultat= preparedStatement.executeQuery();
	        
	         if (resultat.next()) {
	        	 int idFactory= resultat.getInt("factory_id") ;
	        	 String nom= resultat.getString("nom");
	        	 String prenom= resultat.getString("prenom");
	        	 utilisateur= new Utilisateur(id, nom, prenom, idFactory);
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
	     return utilisateur;
	}

	@Override
	public Utilisateur create(Utilisateur obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur update(Utilisateur obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Utilisateur obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lookFor(Utilisateur obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Utilisateur> listeOf(int id, int selecteur) {
		// TODO Auto-generated method stub
		return null;
	}

}
