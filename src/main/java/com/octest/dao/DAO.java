package com.octest.dao;

import java.sql.Connection;
import java.util.ArrayList;

public abstract class DAO<T> {
public Connection connect = DAOFactory.getInstance();
    
    /**
     * Permet de récupérer un objet via son ID
     * @param id
     * @return
     */
    public abstract T find(int id);
    
    /**
     * Permet de créer une entrée dans la base de données
     * par rapport à un objet
     * @param obj
     */
    public abstract T create(T obj);
    
    /**
     * Permet de mettre à jour les données d'une entrée dans la base 
     * @param obj
     */
    public abstract T update(T obj);
    
    /**
     * Permet la suppression d'une entrée de la base
     * @param obj
     */
    public abstract void delete(T obj);

	/**Permet de faire une recherche sur un objet incomplet et 
	 * retourne l'objet correspondant
	 **/
    public abstract void lookFor(T obj);
    
    /**return une liste d'objet correspondant au paramettre
     * le selcteur permet d'adapter la methode si une ou plusieurs
     * clefs etrangere existent dans la table
     */
    public abstract ArrayList<T> listeOf(int id,int selecteur);

} 


