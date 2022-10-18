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
 * Servlet implementation class ListStagiaire
 */
@WebServlet("/liststagiaire")
public class ListStagiaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStagiaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		if(session.getAttribute("session")==null) {
			this.getServletContext().getRequestDispatcher("/connection").forward(request, response);
			}
		else {
			
			int idFormation= Integer.parseInt(request.getParameter("idFormation"));
			DAO<Stagiaire> fac = FactoryOfImpl.getStagiareDAO();
			java.util.ArrayList <Stagiaire> listeStagiaire= fac.listeOf(idFormation, 0);
			session.setAttribute("listeStagiare", listeStagiaire);
			session.setAttribute("idFormation", idFormation);
			this.getServletContext().getRequestDispatcher("/WEB-INF/liststagiaire.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
