package com.octest.servelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.octest.beans.Factory;
import com.octest.forms.Formulaire;


@WebServlet("/ajoutformation")
public class AjoutFormation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AjoutFormation() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		if(session.getAttribute("session")==null) {
			this.getServletContext().getRequestDispatcher("/connection").forward(request, response);
			}
		else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/ajoutformation.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		String nom= request.getParameter("nom");
		Factory factory= (Factory) session.getAttribute("factory");
		int idFactory= factory.getId();
		Formulaire formulaire= Formulaire.getInstance();
		formulaire.ajouterFormation(nom, idFactory );
		session.setAttribute("listFormation",null);
		this.getServletContext().getRequestDispatcher("/principale").forward(request, response);
		
	}

}
