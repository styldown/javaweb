package com.octest.beans;

public class Authentification {
	private int id= 0;
	private String login;
	private String pwd= null;
	private int idUtilisateur=0;
	
	public Authentification(String login, String pwd) {
		this.pwd= pwd;
		this.login= login;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	

}
