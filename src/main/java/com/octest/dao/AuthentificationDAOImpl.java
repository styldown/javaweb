package com.octest.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.octest.beans.Authentification;

public class AuthentificationDAOImpl extends DAO<Authentification>{

	@Override
	public Authentification find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Authentification create(Authentification obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Authentification update(Authentification obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Authentification obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lookFor(Authentification obj) {
		 PreparedStatement preparedStatement = null;
		 ResultSet resultat=null;
	     try {
	    	 connect = DAOFactory.getInstance();
	    	 preparedStatement = connect.prepareStatement
	            		("SELECT * FROM authentification WHERE login= ? and pwd=?;");
	    	 preparedStatement.setString(1, obj.getLogin());
	         preparedStatement.setString(2, obj.getPwd());
	         resultat= preparedStatement.executeQuery();
	        
	         if (resultat.next()) {
	        	 obj.setId(resultat.getInt("id")) ;
	        	 obj.setIdUtilisateur(resultat.getInt("utilisateur_id"));
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
	}

	@Override
	public ArrayList<Authentification> listeOf(int id, int selecteur) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
