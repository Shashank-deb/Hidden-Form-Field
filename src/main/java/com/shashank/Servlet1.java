package com.shashank;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("user_name");
		out.println("<h1>Your Name is : " + name + "</h1>");
		// hidden form field coding in the input type='hidden' is compulsory
		// the form when having the text field will have the value of user_name
		// given to Servlet1 so we need to hidden the user_name
		// and pass the Servlet2
		out.println("" + "<form action='Servlet2'>" + "<input type='hidden' name='user_name' value='" + name + "'/>"
				+ "<button>Go to Second Servlet</button>" + "" + "" + "</form>");

	}

}
