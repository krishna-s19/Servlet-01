package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javafx.runtime.SystemProperties;

public class LinksServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		String pval = req.getParameter("s1");
		
		Locale locales[] = Locale.getAvailableLocales();
		
		if(pval.equalsIgnoreCase("link1")){
			pw.println("<h1 style='text-align:center'>Get All Countries Name </h1>");
			for(Locale l:locales)
				pw.println("<b>"+l.getDisplayCountry()+"</b>");
		}
		else if(pval.equalsIgnoreCase("link2")){
			
			pw.println("<h1 style='text-align:center'>Get All Countries Languages </h1>");
			for(Locale l:locales)
				pw.println("<b>"+l.getDisplayLanguage()+"</b>");
				}
		else{
			pw.println("<h1 style='text-align:center'>Get All System Properties </h1>");
			for(Locale l:locales)
				pw.println("<b>"+System.getProperties()+"</b>");
			}
			pw.println("<a href='links.html'><img src='images/house.png'></a>");
		}
			
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	
	}
}
