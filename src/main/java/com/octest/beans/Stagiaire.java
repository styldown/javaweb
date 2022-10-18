package com.octest.beans;

public class Stagiaire {
	private int id=0;
	private String nom;
	private String prenom;
	private String adresse;
	private String tel;
	private String email;
	private int idFactory;
	private int idFormation;
	
	public Stagiaire(int id, String nom, String prenom, String adresse, String tel, String email, int idFactory, int idFormation) {
		this.id= id;
		this.nom= nom;
		this.prenom= prenom;
		this.adresse= adresse;
		this.tel= tel;
		this.email= email;
		this.idFormation= idFormation;
		this.idFactory= idFactory;
	}
	
	public Stagiaire(String nom, String prenom, String adresse, String tel, String email, int idFactory, int idFormation) {
		this.nom= nom;
		this.prenom= prenom;
		this.adresse= adresse;
		this.tel= tel;
		this.email= email;
		this.idFormation= idFormation;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdFactory() {
		return idFactory;
	}
	public void setIdFactory(int idFactory) {
		this.idFactory = idFactory;
	}
	public int getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(int idFormation) {
		this.idFormation = idFormation;
	}
	

}
