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


@WebServlet("/listformation")
public class ListFormation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListFormation() {
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
			
		this.getServletContext().getRequestDispatcher("/WEB-INF/listeformation.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
