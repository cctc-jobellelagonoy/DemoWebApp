package com.training.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
    CrudOperations op;
    
    public SignUp() {
        super();
        op = new CrudOperations();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		op.insertEntity(request.getParameter("un"), request.getParameter("pw"), request.getParameter("fn"), request.getParameter("ln"), true);
		request.setAttribute("users", op.getUsers());
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);
	}

}
