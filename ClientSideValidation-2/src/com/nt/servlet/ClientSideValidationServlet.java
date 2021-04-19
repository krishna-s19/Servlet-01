package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClientSideValidationServlet extends HttpServlet {

		
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
	
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String address = req.getParameter("address");
		int nage = Integer.parseInt(age);
			
		if(nage>=18)
			pw.println("<h1 style='color:Green;text-align:center;'>"+name+"You are Eligable for Vote </h1>");
		else
		pw.println("<h1 style='color:Green;text-align:center;'>"+name+"You are not  Eligable for Vote </h1>");
		pw.println("<h1><a href='Form.html'><img src='images/house.png'> </a></h1>");
		pw.close();

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	doGet(req, resp);
	
	}
	
	
	
	
}
