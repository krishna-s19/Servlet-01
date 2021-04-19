package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryCaptialServlet extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			
		int countryCode = Integer.parseInt(req.getParameter("country"));
		String capital[] = new String[]{"New Delhi","Moscow","Bejing","WashingtonDc","Islamabad","Katmandu",
																	"Colombo","Paris","Ottawa","Canberra"};
		
		pw.println("<h1 style='color:green; text-align:center';>Captial is           :: "+capital[countryCode-1]+"</h1>");	
		pw.println("<a href='Form.html'>home</a>");
		pw.close();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	doGet(req, resp);
	}
}
