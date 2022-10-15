package com.octest.servelets;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.octest.beans.Stagiaire;
import com.octest.dao.DAO;
import com.octest.dao.DAOFactory;


@WebServlet("/listformation")
public class ListFormation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object ArrayList;
	private java.util.ArrayList<Stagiaire> Stagiare;
       
   
    public ListFormation() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		if(session.getAttribute("session")==null) {
			this.getServletContext().getRequestDispatcher("/").forward(request, response);
			}
		else {
			int idFromation= Integer.parseInt(request.getParameter("idFormation"));
			DAO<Stagiaire> fac = DAOFactory.getStagiareDAO();
			java.util.ArrayList <Stagiaire> listeStagiaire= fac.listeOf(idFromation, 0);
			request.setAttribute("listeStagiare", listeStagiaire);
			this.getServletContext().getRequestDispatcher("/WEB-INF/listeformation.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
