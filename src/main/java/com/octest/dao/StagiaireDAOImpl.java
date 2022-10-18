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
		ResultSet resultat = null;
		 try {
	    	 
	    	 connect = DAOFactory.getInstance();
	    	 preparedStatement = connect.prepareStatement
	            		("SELECT * FROM stagiaire WHERE id=?;");
	    	 preparedStatement.setInt(1, id);
	         resultat= preparedStatement.executeQuery();
	         
	         if (resultat.next()) {
	        	 int idStag= resultat.getInt("factory_id") ;
	        	 String nom= resultat.getString("nom");
	        	 String prenom= resultat.getString("prenom");
	        	 String adresse= resultat.getString("adresse");
	        	 String tel=  resultat.getString("tel");
	        	 String email= resultat.getString("email");
	        	 int idFactory=  resultat.getInt("factory_id");
	        	 int idFormation=  resultat.getInt("formation_id");
	        	 stagiaire= new Stagiaire(idStag,  nom,  prenom, adresse,  tel,  email,  idFactory,  idFormation);
	        			 
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
	     return stagiaire;
	}

	@Override
	public Stagiaire create(Stagiaire obj) {
		PreparedStatement preparedStatement = null;
		 try {
	    	 
	    	 connect = DAOFactory.getInstance();
	    	 preparedStatement = connect.prepareStatement
	            		("INSERT INTO stagiaire (nom, prenom, adresse, tel, email, factory_id, formation_id) VALUES (?,?,?,?,?,?,?)");
	    	 preparedStatement.setString(1, obj.getNom());
	    	 preparedStatement.setString(2, obj.getPrenom());
	    	 preparedStatement.setString(3, obj.getAdresse());
	    	 preparedStatement.setString(4, obj.getTel());
	    	 preparedStatement.setString(5, obj.getEmail());
	    	 preparedStatement.setInt(6, obj.getIdFactory());
	    	 preparedStatement.setInt(7, obj.getIdFormation());
	         preparedStatement.execute();
	         
	
	          
	     } catch (SQLException e) {
	         e.printStackTrace();
	        }
		 finally{
			 try {
	             if (preparedStatement != null)
	            	 preparedStatement.close();
	             if (connect != null)
	            	 connect.close();
				
			} catch (SQLException ignore) {
			}
		 }
		 return obj;
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
		ResultSet resultat=null;
		
		 try {
	    	 
	    	 connect = DAOFactory.getInstance();
	    	 preparedStatement = connect.prepareStatement
	            		("SELECT * FROM stagiaire WHERE formation_id=?;");
	    	 preparedStatement.setInt(1, id);
	         resultat= preparedStatement.executeQuery();
	        
	         while (resultat.next()) {
	        	 int idStag= resultat.getInt("id") ;
	        	 String nom= resultat.getString("nom");
	        	 String prenom= resultat.getString("prenom");
	        	 String adresse= resultat.getString("adresse");
	        	 String tel= resultat.getString("tel");
	        	 String email= resultat.getString("email");
	        	 int idFormation= resultat.getInt("formation_id");
	        	 int idFactory= resultat.getInt("factory_id");
	        	 Stagiaire stagiaire= new Stagiaire(idStag, nom, prenom, adresse, tel, email, idFactory, idFormation);
	        	 listStagiaire.add(stagiaire);
	         }
	          
	     } catch (SQLException e) {
	         e.printStackTrace();
	        }
		 finally{
			 try {
	             if (preparedStatement != null)
	            	 preparedStatement.close();
	             if (resultat != null)
	            	 resultat.close();
	             if (connect != null)
	            	 connect.close();
				
			} catch (SQLException ignore) {
			}
		 }
	     return listStagiaire;
	}

}
