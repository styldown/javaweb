package com.octest.servelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.octest.beans.Factory;
import com.octest.beans.Utilisateur;
import com.octest.dao.DAO;
import com.octest.dao.FactoryOfImpl;
import com.octest.forms.Formulaire;


@WebServlet (urlPatterns={"/connection",""})
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Connexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		session.invalidate();
		this.getServletContext().getRequestDispatcher("/WEB-INF/connection.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");
		Formulaire formulaire= Formulaire.getInstance();
		Utilisateur utilisateur= formulaire.authentification(login, pwd);
		Factory factory=null;
		if (utilisateur != null) {
			HttpSession session= request.getSession();
			session.setAttribute("session", true);
			session.setAttribute("utilisateur", utilisateur);
			DAO<Factory> fac= FactoryOfImpl.getFactoryDAO();
			factory= fac.find(utilisateur.getIdFactory());
			session.setAttribute("factory", factory);
			this.getServletContext().getRequestDispatcher("/principale").forward(request, response);
		}
		else {
			request.setAttribute("erreur", "login ou mot de passe incorrect");
			this.getServletContext().getRequestDispatcher("/WEB-INF/connection.jsp").forward(request, response);
			
		}
			
	}

}
