package com.octest.servelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.octest.beans.Factory;
import com.octest.beans.Formation;
import com.octest.dao.DAO;
import com.octest.dao.FactoryOfImpl;
import com.octest.forms.Formulaire;


@WebServlet("/ajoutstagiaire")
public class AjoutStagiaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutStagiaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		if(session.getAttribute("session")==null) {
			this.getServletContext().getRequestDispatcher("/connection").forward(request, response);
			}
		else {
			Factory factory= (Factory) session.getAttribute("factory");
			int idFactory= factory.getId();
			DAO<Formation> fac = FactoryOfImpl.getFormationDAO();
			java.util.ArrayList <Formation> listFormation= fac.listeOf(idFactory, 0);
			session.setAttribute("listFormation", listFormation);
			this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutstagiaire.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		String nom= request.getParameter("nom");
		String prenom= request.getParameter("prenom");
		String adresse= request.getParameter("adresse");
		String email= request.getParameter("email");
		String tel= request.getParameter("tel");
		int idFormation= Integer.parseInt(request.getParameter("idFormation"));
		Factory factory= (Factory) session.getAttribute("factory");
		int idFactory= factory.getId();
		Formulaire formulaire= Formulaire.getInstance();
		formulaire.ajouterStagiaire(nom, prenom, adresse, email, tel, idFormation, idFactory );
		session.setAttribute("listeStagiare",null);
		this.getServletContext().getRequestDispatcher("/principale").forward(request, response);
		
	}

}
