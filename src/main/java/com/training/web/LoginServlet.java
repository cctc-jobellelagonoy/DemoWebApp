package com.training.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CrudOperations op;
  
    public LoginServlet() {
        super();
        op = new CrudOperations();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = op.findUser(request.getParameter("un"), request.getParameter("pw"));
		PrintWriter out = response.getWriter();
		
		if(user != null) {
			request.setAttribute("user", user.getFirstName());
			request.setAttribute("users", op.getUsers());
			request.setAttribute("courses", op.getCourses());
			RequestDispatcher rd = request.getRequestDispatcher("courses.jsp");
			rd.forward(request, response);
		}else {
			out.println("<html><body>");
			out.println("<h1>Login Failed: Try again</h1>");
			out.println("/<body></html>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
