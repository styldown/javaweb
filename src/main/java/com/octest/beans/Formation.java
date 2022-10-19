package com.octest.beans;

public class Formation {
	private int id=0;
	private String nom;
	private int idFactory;
	
	public Formation(int id, String nom, int idFactory) {
		this.id= id;
		this.nom= nom;
		this.idFactory= idFactory;
	}
	
	public Formation(String nom, int idFactory) {
		this.nom= nom;
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
	

}
