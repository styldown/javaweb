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
import com.octest.dao.DAOFactory;

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
			this.getServletContext().getRequestDispatcher("/").forward(request, response);
			}
		else {
			int idStagiaire= Integer.parseInt(request.getParameter("idStagiaire"));
			DAO<Stagiaire> fac = DAOFactory.getStagiareDAO();
			java.util.ArrayList <Stagiaire> listeStagiaire= fac.listeOf(idStagiaire, 0);
			request.setAttribute("listeStagiare", listeStagiaire);
			this.getServletContext().getRequestDispatcher("/WEB-INF/listeformation.jsp").forward(request, response);
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
