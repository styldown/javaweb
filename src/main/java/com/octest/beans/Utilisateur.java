package com.octest.beans;

public class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private int idFactory;
	
	public Utilisateur(int id, String nom, String prenom, int idFactory) {
		this.id= id;
		this.nom= nom;
		this.prenom= prenom;
		this.idFactory= idFactory;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getIdFactory() {
		return idFactory;
	}

	public void setIdFactory(int idFactory) {
		this.idFactory = idFactory;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
