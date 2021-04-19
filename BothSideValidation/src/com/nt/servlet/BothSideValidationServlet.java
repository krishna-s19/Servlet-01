package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BothSideValidationServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");

		String name = req.getParameter("name").trim();
		String ager = req.getParameter("age").trim();
		String address = req.getParameter("address").trim();
		String vstatus= req.getParameter("vflag").trim();
		
		int age=0;
		
		if(vstatus.equalsIgnoreCase("no")){
		
		// *********************************************************
		List<String> errorList = new ArrayList();
		if (name == null || name.length() == 0 || name.equals(""))
			errorList.add("Person name is required");
		else if (name.length() < 10)
			errorList.add("Person name minimum 10 characters");
		// ****************************************************************
			
	System.out.println("Servlet Validation"); 
		try {
			age = Integer.parseInt(ager);
			if (age < 1 || age > 125)
				errorList.add("Person age Between 1 to 125 Only ");

		} catch (NumberFormatException e) {
			errorList.add("Person name is Numeric Only");
		}
		
		if (address == null || address.length() == 0 || address.equals(""))
			errorList.add("Person address is  required");

		if (errorList.size() != 0) {
			pw.println("<ul style='color:red'>");
			for (String error : errorList) {
				pw.println("<li>" + error + "</li>");
			}
			pw.println("</ul>");

			return;
			}
		}else {
			age = Integer.parseInt(ager);
		}
		if (age >= 18)
			pw.println("<h1 style='color:Green;text-align:center;'> Mrs/Mr/Miss   " + name
					+ " You are Eligable for Voting ");
		else
			pw.println("<h1 style='color:Green;text-align:center;'> Mrs/Mr/Miss   " + name
					+ " You are not Eligable for Voting ");

		pw.println("<br><a href='Form.html'><img src='images/house.png'></a>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}

}
