package com.octest.servelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.octest.beans.Stagiaire;
import com.octest.dao.DAO;
import com.octest.dao.FactoryOfImpl;

/**
 * Servlet implementation class Stagiaire
 */
@WebServlet("/stagiaire")
public class StagiaireServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public StagiaireServ() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		if(session.getAttribute("session")==null) {
			this.getServletContext().getRequestDispatcher("/connection").forward(request, response);
			}
		else {
		
			int idStagiaire= Integer.parseInt(request.getParameter("idStagiaire"));
			DAO<Stagiaire> fac = FactoryOfImpl.getStagiareDAO();
			Stagiaire stagiaire= fac.find(idStagiaire);
			session.setAttribute("stagiaire", stagiaire);
			request.setAttribute("idFormation", (session.getAttribute("idFormation")));
			this.getServletContext().getRequestDispatcher("/WEB-INF/stagiaire.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
