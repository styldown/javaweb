package com.octest.beans;

public class Factory {
	private int id;
	private String nom;
	private String adresse;
	
	public Factory(int id, String nom, String adresse ) {
		this.setId(id);
		this.setNom(nom);
		this.setAdresse(adresse);
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	

}
